package com.liborrow.webservice.business.contract.manager;

import org.liborrow.webservice.model.dto.ItemDTO;
import org.liborrow.webservice.model.dto.UserLightDTO;
import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.liborrow.webservice.model.utilsobject.ReservationResponse;
import org.liborrow.webservice.model.utilsobject.SearchResponse;

public interface ItemManager {
	ItemDTO findItemById(long id);
	SearchResponse searchWithSimpleString(ItemCriterias itemCriterias, String[] simpleStringSplited);
	SearchResponse getLastFiveItems();
	ReservationResponse reserveItem(ItemDTO item, UserLightDTO user);
	ReservationResponse cancelItemReservation(Long itemId, UserLightDTO user);
}
