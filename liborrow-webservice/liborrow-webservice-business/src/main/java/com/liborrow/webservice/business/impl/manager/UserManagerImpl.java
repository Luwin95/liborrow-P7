package com.liborrow.webservice.business.impl.manager;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.UserAccount;
import org.liborrow.webservice.model.entities.UserLight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.UserManager;
import com.liborrow.webservice.consumer.repository.UserAccountRepository;
import com.liborrow.webservice.consumer.repository.UserLightRepository;

@Service
public class UserManagerImpl extends AbstractManagerImpl implements UserManager{
	
	@Autowired
	UserAccountRepository userAccountRepository;
	
	@Autowired
	UserLightRepository userLightRepository;
	
	@Override
	@Transactional(readOnly = true)
	public boolean isInDatabase(String email)
	{
		return userAccountRepository.emailExistInDb(email);
	}
	
	@Override
	public boolean validateCredentials(UserAccount user, String plainPassword)
	{
		boolean passwordChecked = false;
        if(user.getPassword() == null || !user.getPassword().startsWith("$2a$")){
            throw new IllegalArgumentException("Le hash n'est pas valide");
        }

        passwordChecked = BCrypt.checkpw(plainPassword, user.getPassword());

        return passwordChecked;
	}
	
	@Override
	@Transactional(readOnly = true)
	public UserLight login(String email, String password)
	{
		if(isInDatabase(email))
		{
			UserAccount user = userAccountRepository.findByEmail(email);
			userEntityHibernateInitialization(user);
			if(user !=null)
			{
				if(validateCredentials(user,password))
				{
					UserLight userLight = userLightRepository.findOne(user.getId());
					userEntityHibernateInitialization(userLight);
					return userLight;
				}else {
					return null;
				}
			}else {
				return null;
			}
		}else {
			return null;
		}
	}
	
	@Override
	public void userEntityHibernateInitialization(UserAccount user)
	{
		Hibernate.initialize(user.getCitizenship());
	}
	
	@Override
	public void userEntityHibernateInitialization(UserLight user)
	{
		Hibernate.initialize(user.getCitizenship());
		Hibernate.initialize(user.getBorrows());
		for(Borrow borrow : user.getBorrows())
		{
			Hibernate.initialize(borrow.getItems());
			Hibernate.initialize(borrow.getBorrower());
		}
	}
}
