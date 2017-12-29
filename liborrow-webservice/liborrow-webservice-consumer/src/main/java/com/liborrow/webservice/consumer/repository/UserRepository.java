package com.liborrow.webservice.consumer.repository;

import org.liborrow.webservice.model.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
