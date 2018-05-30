package org.liborrow.webservice.model.transformer.contract;

import java.util.List;
import java.util.Set;


import org.liborrow.webservice.model.dto.WaitingListDTO;
import org.liborrow.webservice.model.entities.WaitingList;

public interface WaitingListTransformer {
	WaitingListDTO toWaitingListDto(WaitingList waitingList, boolean isParent, String classParentName);
	public List<WaitingListDTO> toWaitingListsDTO(List<WaitingList> waitingLists, boolean isParent, String classParentName);
	WaitingList toWaitingListEntity(WaitingListDTO waitingListDTO, boolean isParent, String classParentName);
	public List<WaitingList> toWaitingListEntities(List<WaitingListDTO> waitingListsDTO, boolean isParent, String classParentName);
}
