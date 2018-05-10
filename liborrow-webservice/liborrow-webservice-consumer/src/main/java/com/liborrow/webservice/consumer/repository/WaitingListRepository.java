package com.liborrow.webservice.consumer.repository;

import org.liborrow.webservice.model.entities.WaitingList;
import org.springframework.data.repository.CrudRepository;

public interface WaitingListRepository extends CrudRepository<WaitingList, Long> {

}
