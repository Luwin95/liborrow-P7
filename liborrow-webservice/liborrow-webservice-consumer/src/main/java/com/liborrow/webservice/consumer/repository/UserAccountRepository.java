package com.liborrow.webservice.consumer.repository;

import org.liborrow.webservice.model.entities.UserAccount;
import org.springframework.data.repository.CrudRepository;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {

}
