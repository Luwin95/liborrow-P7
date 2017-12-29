package com.liborrow.webservice.consumer.repository;

import java.util.List;

import org.liborrow.webservice.model.entities.Magazine;

public interface MagazineRepository extends ItemBaseRepository<Magazine> {
	@Override
    List<Magazine> findAll();
}
