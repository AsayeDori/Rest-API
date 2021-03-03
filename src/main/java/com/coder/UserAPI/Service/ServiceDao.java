package com.coder.UserAPI.Service;

import java.util.List;

import com.coder.UserAPI.Entity.Roles;
import com.coder.UserAPI.Entity.Users;

public interface ServiceDao {

	List<Users> getUsers();
	Users searchUser(int id);
	Users deleteUser(Users user);
	Users putUser(Users user);
	Users addUser(Users user);
	List<Roles> getRoles();
	Roles getRole(int id);
	Roles addRole(Roles role);
	Roles updateRole(Roles role);
	Roles deleteRole(Roles role);
}
