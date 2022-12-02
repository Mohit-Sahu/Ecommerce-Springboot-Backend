package com.mohit.ecommerce.Ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mohit.ecommerce.Ecommerce.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String>{

}
