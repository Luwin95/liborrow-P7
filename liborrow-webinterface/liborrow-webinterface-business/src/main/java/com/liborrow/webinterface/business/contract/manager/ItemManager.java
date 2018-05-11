package com.liborrow.webinterface.business.contract.manager;

import com.liborrow.webinterface.generated.model.ItemCriterias;
import com.liborrow.webinterface.generated.model.ItemDTO;
import com.liborrow.webinterface.generated.model.ReservationResponse;
import com.liborrow.webinterface.generated.model.SearchResponse;
import com.liborrow.webinterface.generated.model.UserLightDTO;

public interface ItemManager {
	ItemDTO getItem(Long itemId);
	SearchResponse searchItem(ItemCriterias itemCriterias);
	SearchResponse findLastFiveItems();
	SearchResponse searchBook(ItemCriterias itemCriterias);
	SearchResponse searchAuthor(ItemCriterias itemCriterias);
	SearchResponse searchMagazine(ItemCriterias itemCriterias);
	ReservationResponse reserveItem(ItemDTO item, UserLightDTO user);
	ReservationResponse cancelItemReservation(Long itemId, UserLightDTO user);
}
