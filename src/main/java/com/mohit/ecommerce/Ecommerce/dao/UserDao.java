package com.mohit.ecommerce.Ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mohit.ecommerce.Ecommerce.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String>{
	

}
