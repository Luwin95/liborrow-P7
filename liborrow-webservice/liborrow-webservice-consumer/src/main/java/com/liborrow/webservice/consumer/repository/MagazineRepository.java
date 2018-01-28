package com.liborrow.webservice.consumer.repository;

import java.util.List;
import java.util.Set;

import org.liborrow.webservice.model.entities.Magazine;

public interface MagazineRepository extends ItemBaseRepository<Magazine> {
	@Override
    List<Magazine> findAll();
	
	Set<Magazine> findTop5ByOrderByIdDesc();
}
