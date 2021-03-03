package com.coder.UserAPI.Repo;

import java.util.List;

import com.coder.UserAPI.Entity.Roles;

public interface RolesDao {

	List<Roles> getRoles();
	Roles getRole(int id);
	Roles addRole(Roles role);
	Roles updateRole(Roles role);
	Roles deleteRole(Roles role);
	
}
