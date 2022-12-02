package com.mohit.ecommerce.Ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.ecommerce.Ecommerce.dao.RoleDao;
import com.mohit.ecommerce.Ecommerce.entity.Role;

@Service
public class RoleService {
	@Autowired
	private RoleDao roleDao;
	public Role createNewRole(Role role) {
		return roleDao.save(role);
	}

}
