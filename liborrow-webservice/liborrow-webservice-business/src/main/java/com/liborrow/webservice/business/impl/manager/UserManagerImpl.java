package com.liborrow.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.UserAccount;
import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.utilsobject.UserCriterias;
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
	public UserLightDTO login(String email, String password)
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
					UserLightDTO userLightDTO = new UserLightDTO();
					userEntityHibernateInitialization(userLight);
					userLightDTO = getTransformerFactory().getUserLightTransformer().toUserLightDto(userLight, true, userLightDTO.getClass().getName());
					
					return userLightDTO;
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
	@Transactional(readOnly = true)
	public List<UserLightDTO> searchUser(UserCriterias userCriterias) {
		List<UserLightDTO> users = new ArrayList<>();
		users.addAll(getTransformerFactory().getUserLightTransformer().toUsersLightDTO(getDaoFactory().getUserDao().searchUser(userCriterias), true, UserLight.class.getSimpleName()));
		return users;
	}
	
	@Override
	@Transactional(readOnly = true)
	public UserLightDTO findById(long idUser) {
		UserLight user = userLightRepository.findOne(idUser);
		userEntityHibernateInitialization(user);
		UserLightDTO userChosen = getTransformerFactory().getUserLightTransformer().toUserLightDto(user, true, UserLight.class.getSimpleName());
		return userChosen;
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
//			Hibernate.initialize(borrow.getBook());
//			Hibernate.initialize(borrow.getMagazine());
			Hibernate.initialize(borrow.getItem());
			Hibernate.initialize(borrow.getBorrower());
		}
	}
}
