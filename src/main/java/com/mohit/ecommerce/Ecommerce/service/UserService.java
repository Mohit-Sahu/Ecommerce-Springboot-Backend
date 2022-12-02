package com.mohit.ecommerce.Ecommerce.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mohit.ecommerce.Ecommerce.dao.RoleDao;
import com.mohit.ecommerce.Ecommerce.dao.UserDao;
import com.mohit.ecommerce.Ecommerce.entity.Role;
import com.mohit.ecommerce.Ecommerce.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userdao;
	
	@Autowired
	private RoleDao roleDao;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
  
	 
	
	public void initRolesAndUser() {
		Role adminRole=new Role();
		adminRole.setRoleName("Admin");
		adminRole.setRoleDesc("Admin Role");
		roleDao.save(adminRole);
		
		Role userRole=new Role();
		userRole.setRoleName("User");
		userRole.setRoleDesc("Default Role for user");
		roleDao.save(userRole);
		
		User adminUser=new User();
		adminUser.setUserFirstName("admin");
		adminUser.setUserLastName("admin");
		adminUser.setUserName("admin123");
		adminUser.setUserPassword(getEncodedPassword("admin@pass"));
		Set<Role> adminRoles=new HashSet<>();
		adminRoles.add(adminRole);
		adminUser.setRole(adminRoles);
		userdao.save(adminUser);
		
//		User user=new User();
//		user.setUserFirstName("mohit");
//		user.setUserLastName("sahu");
//		user.setUserName("mohit123");
//		user.setUserPassword(getEncodedPassword("mohit@123"));
//		Set<Role> userRoles=new HashSet<>();
//		userRoles.add(userRole);
//		user.setRole(userRoles);
//		userdao.save(user);
//		
		
		
		
	}
	public User registerNewUser(User user) {
        Role role = roleDao.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));

        return userdao.save(user);
    }
	
	public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
