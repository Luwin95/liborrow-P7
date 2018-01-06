package com.liborrow.webservice.consumer.repository;

import org.liborrow.webservice.model.entities.UserAccount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
	
	@Query("select count(u)>0 from User u where email=:email")
	public boolean emailExistInDb(@Param("email") String email);

	UserAccount findByEmail(String email);
}
