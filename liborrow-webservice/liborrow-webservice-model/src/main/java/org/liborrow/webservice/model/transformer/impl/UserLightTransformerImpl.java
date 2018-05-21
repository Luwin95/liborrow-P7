package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.Borrow;
import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.transformer.contract.BorrowTransformer;
import org.liborrow.webservice.model.transformer.contract.CitizenshipTransformer;
import org.liborrow.webservice.model.transformer.contract.UserLightTransformer;
import org.liborrow.webservice.model.transformer.contract.WaitingListTransformer;

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
		userTransformed.setRole(user.getRole());
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
		if(user.getReservations()!=null && (isParent||classParentName.equals(UserLight.class.getSimpleName()))) {
			WaitingListTransformer waitingListTransformer = new WaitingListTransformerImpl();
			userTransformed.setReservations(waitingListTransformer.toWaitingListsDTO(user.getReservations(), false, userTransformed.getClass().getSimpleName()));
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
	
	@Override
	public UserLight toUserLightEntity(UserLightDTO user, boolean isParent, String classParentName) {
		UserLight userTransformed = new UserLight();
		userTransformed.setId(user.getId());
		userTransformed.setEmail(user.getEmail());
		userTransformed.setFirstname(user.getFirstname());
		userTransformed.setLastname(user.getLastname());
		userTransformed.setPhoneNumber(user.getPhoneNumber());
		userTransformed.setPostCode(user.getPostCode());
		userTransformed.setAddress(user.getAddress());
		userTransformed.setRole(user.getRole());
		userTransformed.setRecall(user.isRecall());
		
		if(user.getBorrows()!=null && (isParent||classParentName.equals(Citizenship.class.getSimpleName())))
		{
			BorrowTransformer borrowTransformer = new BorrowTransformerImpl();
			userTransformed.setBorrows(borrowTransformer.toBorrowsEntities(user.getBorrows(), false, userTransformed.getClass().getSimpleName()));
		}
		if(user.getCitizenship()!=null && (isParent||classParentName.equals(Borrow.class.getSimpleName())))
		{
			CitizenshipTransformer citizenshipTransformer= new CitizenshipTransformerImpl();
			userTransformed.setCitizenship(citizenshipTransformer.toCitizenshipEntity(user.getCitizenship(), false, userTransformed.getClass().getSimpleName()));
		}
		return userTransformed;
	}
	
	@Override
	public Set<UserLight> toUsersLightEntities(Set<UserLightDTO> users, boolean isParent, String classParentName) {
		Set<UserLight> usersTransformed = new HashSet<>();
		for(UserLightDTO user : users)
		{
			usersTransformed.add(toUserLightEntity(user, isParent, classParentName));
		}
		return usersTransformed;
	}
}
