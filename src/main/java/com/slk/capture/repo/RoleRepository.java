package com.slk.capture.repo;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.slk.capture.model.Role;

public interface RoleRepository extends GraphRepository<Role> {

	public Role findByRoleName(String roleName);
}
