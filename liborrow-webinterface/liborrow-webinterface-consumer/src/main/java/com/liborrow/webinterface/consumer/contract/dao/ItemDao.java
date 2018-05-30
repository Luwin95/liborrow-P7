package com.liborrow.webinterface.consumer.contract.dao;

import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.ItemDTO;
import com.liborrow.webinterface.generated.model.ReservationResponse;
import com.liborrow.webinterface.generated.model.SearchResponse;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public interface ItemDao {
	ItemDTO getItem(Long itemId);
	SearchResponse searchItem(ItemCriterias itemCriterias);
	SearchResponse findLastFiveItems();
	ReservationResponse reserveItem(ItemDTO item, UserLightDTO user);
	ReservationResponse cancelItemReservation(Long itemId, UserLightDTO user);
}
