package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.BorrowDTO;
import org.liborrow.webservice.model.dto.UserDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.entities.UserAccount;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;
import org.liborrow.webservice.model.transformer.contract.CitizenshipTransformer;
import org.liborrow.webservice.model.transformer.contract.UserAccountTransformer;

public class UserAccountTransformerImpl extends AbstractTransformerImpl implements UserAccountTransformer {
	@Override
	public UserAccount toUserAccountEntity(UserDTO user, boolean isParent, String classParentName) {
		UserAccount userTransformed = new UserAccount();
		userTransformed.setId(user.getId());
		userTransformed.setEmail(user.getEmail());
		userTransformed.setFirstname(user.getFirstname());
		userTransformed.setLastname(user.getLastname());
		userTransformed.setPhoneNumber(user.getPhoneNumber());
		userTransformed.setPostCode(user.getPostCode());
		userTransformed.setAddress(user.getAddress());
		userTransformed.setRole(user.getRole());
		userTransformed.setPassword(user.getPassword());
		userTransformed.setRecall(user.isRecall());
		
		if(user.getBorrows()!=null && (isParent||classParentName.equals(Citizenship.class.getSimpleName())))
		{
			for(BorrowDTO borrow : user.getBorrows()){
				Borrow borrowEntity = getEm().find(Borrow.class, borrow.getId());
				userTransformed.getBorrows().add(borrowEntity);
			}
		}
		if(user.getCitizenship()!=null && (isParent||classParentName.equals(Borrow.class.getSimpleName())))
		{
			userTransformed.setCitizenship(getEm().find(Citizenship.class, user.getCitizenship().getId()));
		}
		return userTransformed;
	}
	
	@Override
	public Set<UserAccount> toUsersAccountEntities(Set<UserDTO> users, boolean isParent, String classParentName) {
		Set<UserAccount> usersTransformed = new HashSet<>();
		for(UserDTO user : users)
		{
			usersTransformed.add(toUserAccountEntity(user, isParent, classParentName));
		}
		return usersTransformed;
	}
	
	@Override
	public UserDTO toUserDto(UserAccount user, boolean isParent, String classParentName) {
		UserDTO userTransformed = new UserDTO();
		userTransformed.setId(user.getId());
		userTransformed.setEmail(user.getEmail());
		userTransformed.setFirstname(user.getFirstname());
		userTransformed.setLastname(user.getLastname());
		userTransformed.setPhoneNumber(user.getPhoneNumber());
		userTransformed.setPostCode(user.getPostCode());
		userTransformed.setAddress(user.getAddress());
		userTransformed.setRole(user.getRole());
		userTransformed.setPassword(user.getPassword());
		userTransformed.setRecall(user.isRecall());
		
		if(user.getBorrows()!=null && (isParent||classParentName.equals("org.liborrow.webservice.model.dto.CitizenshipDTO")))
		{
			BorrowTransformer borrowTransformer = new BorrowTransformerImpl();
			userTransformed.setBorrows(borrowTransformer.toBorrowsDTO(user.getBorrows(), false, userTransformed.getClass().getName()));
		}
		if(user.getCitizenship()!=null && (isParent||classParentName.equals("org.liborrow.webservice.model.dto.BorrowDTO")))
		{
			CitizenshipTransformer citizenshipTransformer= new CitizenshipTransformerImpl();
			userTransformed.setCitizenship(citizenshipTransformer.toCitizenshipDTO(user.getCitizenship(), false, userTransformed.getClass().getName()));
		}
		return userTransformed;
	}
	
	@Override
	public Set<UserDTO> toUsersDTO(Set<UserAccount> users, boolean isParent, String classParentName) {
		Set<UserDTO> usersTransformed = new HashSet<>();
		for(UserAccount user : users)
		{
			usersTransformed.add(toUserDto(user, isParent, classParentName));
		}
		return usersTransformed;
	}

}
