package com.coder.UserAPI.Repo;

import java.util.List;

import com.coder.UserAPI.Entity.Users;

public interface UsersDao {
	List<Users> getUsers();
	Users searchUser(int id);
	Users deleteUser(Users user);
	Users putUser(Users user);
	Users addUser(Users user);
}
