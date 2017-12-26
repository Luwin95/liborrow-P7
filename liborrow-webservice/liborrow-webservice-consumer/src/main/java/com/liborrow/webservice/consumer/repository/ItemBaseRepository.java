package com.liborrow.webservice.consumer.repository;

import org.liborrow.webservice.model.entities.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ItemBaseRepository<T extends Item> extends CrudRepository<T,Long> {

}
