package com.liborrow.webservice.business.impl.manager;

import javax.annotation.Resource;

import org.liborrow.webservice.model.entities.Item;
import org.liborrow.webservice.model.utilsobject.ItemCriterias;
import org.liborrow.webservice.model.utilsobject.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liborrow.webservice.business.contract.manager.ItemManager;
import com.liborrow.webservice.consumer.repository.ItemRepository;


@Service
public class ItemManagerImpl extends AbstractManagerImpl implements ItemManager {
	@Autowired
	@Resource
	ItemRepository itemRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Item findItemById(long id)
	{
		return itemRepository.findOne(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public SearchResponse searchWithSimpleString(ItemCriterias itemCriterias, String[] simpleStringSplited) {
		SearchResponse searchResponse = new SearchResponse();
		searchResponse.getAuthors().addAll(
				getTransformerFactory().getAuthorTransformer().toAuthorsDTO(
						getDaoFactory().getAuthorDao().searchWithSimpleStringAuthor(itemCriterias, simpleStringSplited),true, "org.liborrow.webservice.model.dto.AuthorDTO")
				);
		searchResponse.getBooks().addAll(
				getTransformerFactory().getBookTransformer().toBooksDTO(
						getDaoFactory().getBookDao().searchWithSimpleStringBook(itemCriterias, simpleStringSplited), true, "org.liborrow.webservice.model.dto.BookDTO")
				);
		searchResponse.getMagazines().addAll(
				getTransformerFactory().getMagazineTransformer().toMagazinesDTO(
						getDaoFactory().getMagazineDao().searchWithSimpleStringMagazine(itemCriterias, simpleStringSplited), true, "org.liborrow.webservice.model.dto.MagazineDTO")
				);
		return searchResponse;
	}

}
