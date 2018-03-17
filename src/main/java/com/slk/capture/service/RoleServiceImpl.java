package com.slk.capture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.capture.model.Role;
import com.slk.capture.repo.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository RoleRepository;

	@Override
	public Role addRole(String roleName) {
		   Role role = new Role();
		   role.setRoleName(roleName);
		   return RoleRepository.save(role); 
	}

	@Override
	public Role getRole(Long graphId) {
		return RoleRepository.findOne(graphId);
	}

	@Override
	public List<Role> getAllRole() {
		return (List<Role>) RoleRepository.findAll();
	}
	
	

}
