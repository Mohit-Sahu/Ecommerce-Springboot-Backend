package com.mohit.ecommerce.Ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
  @Id
  private String roleName;
  private String roleDesc;
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
public String getRoleDesc() {
	return roleDesc;
}
public void setRoleDesc(String roleDesc) {
	this.roleDesc = roleDesc;
}
public Role(String roleName, String roleDesc) {
	super();
	this.roleName = roleName;
	this.roleDesc = roleDesc;
}
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
}
