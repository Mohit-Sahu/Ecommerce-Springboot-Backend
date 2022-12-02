package com.mohit.ecommerce.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mohit.ecommerce.Ecommerce.entity.Role;
import com.mohit.ecommerce.Ecommerce.service.RoleService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	 @Autowired
	 private RoleService roleservice;  
	 @PostMapping({"/createNewRole"})
	public Role createNewRole(@RequestBody Role role) {
		 return roleservice.createNewRole(role);
		
		 
		
	}

}
