package org.liborrow.webservice.model.transformer.impl;

import java.util.ArrayList;
import java.util.List;

import org.liborrow.webservice.model.dto.BookDTO;
import org.liborrow.webservice.model.dto.MagazineDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.dto.WaitingListDTO;
import org.liborrow.webservice.model.entities.Book;
import org.liborrow.webservice.model.entities.Magazine;
import org.liborrow.webservice.model.entities.UserLight;
import org.liborrow.webservice.model.entities.WaitingList;
import org.liborrow.webservice.model.transformer.contract.BookTransformer;
import org.liborrow.webservice.model.transformer.contract.MagazineTransformer;
import org.liborrow.webservice.model.transformer.contract.UserLightTransformer;
import org.liborrow.webservice.model.transformer.contract.WaitingListTransformer;

public class WaitingListTransformerImpl implements WaitingListTransformer {
	
	@Override
	public WaitingListDTO toWaitingListDto(WaitingList waitingList, boolean isParent, String classParentName) {
		WaitingListDTO waitingListTransformed = new WaitingListDTO();
		waitingListTransformed.setId(waitingList.getId());
		waitingListTransformed.setPosition(waitingList.getPosition());
		waitingListTransformed.setNotificationDate(waitingList.getNotificationDate());
		if(waitingList.getItem() instanceof Book && (isParent||classParentName.equals(UserLight.class.getSimpleName())))
		{
			BookTransformer bookTransformer = new BookTransformerImpl();
			waitingListTransformed.setItem(bookTransformer.toBookDTO((Book) waitingList.getItem(), false, WaitingList.class.getSimpleName()));
		}
		if(waitingList.getItem() instanceof Magazine && (isParent||classParentName.equals(UserLight.class.getSimpleName())))
		{
			MagazineTransformer magazineTransformer = new MagazineTransformerImpl();
			waitingListTransformed.setItem(magazineTransformer.toMagazineDTO((Magazine) waitingList.getItem(), false, WaitingList.class.getSimpleName()));
		}
		if(waitingList.getBorrower()!=null && (isParent||classParentName.equals(Magazine.class.getSimpleName())||classParentName.equals(Book.class.getSimpleName())))
		{
			UserLightTransformer userLightTransformer = new UserLightTransformerImpl();
			waitingListTransformed.setBorrower(userLightTransformer.toUserLightDto( waitingList.getBorrower(), false, WaitingList.class.getSimpleName()));
		}
		return waitingListTransformed;
	}
	
	@Override
	public List<WaitingListDTO> toWaitingListsDTO(List<WaitingList> waitingLists, boolean isParent, String classParentName) {
		List<WaitingListDTO> waitingListsTransformed = new ArrayList<>();
		for(WaitingList waitingList : waitingLists)
		{
			waitingListsTransformed.add(toWaitingListDto(waitingList, isParent, classParentName));
		}
		return waitingListsTransformed;
	}
	
	@Override
	public WaitingList toWaitingListEntity(WaitingListDTO waitingListDTO, boolean isParent, String classParentName) {
		WaitingList waitingListTransformed = new WaitingList();
		waitingListTransformed.setId(waitingListDTO.getId());
		waitingListTransformed.setPosition(waitingListDTO.getPosition());
		waitingListTransformed.setNotificationDate(waitingListDTO.getNotificationDate());
		if(waitingListDTO.getItem() instanceof BookDTO && (isParent||classParentName.equals(UserLight.class.getSimpleName())))
		{
			BookTransformer bookTransformer = new BookTransformerImpl();
			waitingListTransformed.setItem(bookTransformer.toBookEntity((BookDTO) waitingListDTO.getItem(), false, WaitingListDTO.class.getSimpleName()));
		}
		if(waitingListDTO.getItem() instanceof MagazineDTO && (isParent||classParentName.equals(UserLightDTO.class.getSimpleName())))
		{
			MagazineTransformer magazineTransformer = new MagazineTransformerImpl();
			waitingListTransformed.setItem(magazineTransformer.toMagazineEntity((MagazineDTO) waitingListDTO.getItem(), false, WaitingListDTO.class.getSimpleName()));
		}
		if(waitingListDTO.getBorrower()!=null && (isParent||classParentName.equals(Magazine.class.getSimpleName())||classParentName.equals(BookDTO.class.getSimpleName())))
		{
			UserLightTransformer userLightTransformer = new UserLightTransformerImpl();
			waitingListTransformed.setBorrower(userLightTransformer.toUserLightEntity( waitingListDTO.getBorrower(), false, WaitingListDTO.class.getSimpleName()));
		}
		return waitingListTransformed;
	}
	
	@Override
	public List<WaitingList> toWaitingListEntities(List<WaitingListDTO> waitingListsDTO, boolean isParent, String classParentName) {
		List<WaitingList> waitingListsTransformed = new ArrayList<>();
		for(WaitingListDTO waitingListDTO : waitingListsDTO)
		{
			waitingListsTransformed.add(toWaitingListEntity(waitingListDTO, isParent, classParentName));
		}
		return waitingListsTransformed;
	}
}
