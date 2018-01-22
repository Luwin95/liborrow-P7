package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;
import org.liborrow.webservice.model.transformer.contract.CitizenshipTransformer;
import org.liborrow.webservice.model.transformer.contract.UserLightTransformer;

public class UserLightTransformerImpl implements UserLightTransformer {

	@Override
	public UserLightDTO toUserLightDto(UserLight user, boolean isParent, String classParentName) {
		UserLightDTO userTransformed = new UserLightDTO();
		userTransformed.setId(user.getId());
		userTransformed.setEmail(user.getEmail());
		userTransformed.setFirstname(user.getFirstname());
		userTransformed.setLastname(user.getLastname());
		userTransformed.setPhoneNumber(user.getPhoneNumber());
		userTransformed.setPostCode(user.getPostCode());
		userTransformed.setAddress(user.getAddress());
		
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
	public Set<UserLightDTO> toUsersLightDTO(Set<UserLight> users, boolean isParent, String classParentName) {
		Set<UserLightDTO> usersTransformed = new HashSet<>();
		for(UserLight user : users)
		{
			usersTransformed.add(toUserLightDto(user, isParent, classParentName));
		}
		return usersTransformed;
	}
}
