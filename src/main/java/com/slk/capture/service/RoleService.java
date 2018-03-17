package com.slk.capture.service;

import java.util.List;

import com.slk.capture.model.Role;

public interface RoleService {
	
	public Role addRole(String roleName);
	
	 public Role getRole(Long graphId);
	 
	 public List<Role> getAllRole();

}
