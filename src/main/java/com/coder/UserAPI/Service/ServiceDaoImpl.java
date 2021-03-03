package com.coder.UserAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coder.UserAPI.Entity.Roles;
import com.coder.UserAPI.Entity.Users;
import com.coder.UserAPI.Repo.RolesDao;
import com.coder.UserAPI.Repo.UsersDao;

@Service
public class ServiceDaoImpl implements ServiceDao {

	@Autowired
	UsersDao usersDao;
	
	@Autowired
	RolesDao rolesDao;
	
	@Override
	public List<Users> getUsers() {
		return usersDao.getUsers();
	}

	@Override
	public Users searchUser(int id) {
		return usersDao.searchUser(id);
	}

	@Override
	@Transactional
	public Users deleteUser(Users user) {
		return usersDao.deleteUser(user);
	}

	@Override
	@Transactional
	public Users putUser(Users user) {
		return usersDao.putUser(user);
	}

	@Override
	@Transactional
	public Users addUser(Users user) {
		return usersDao.addUser(user);
	}

	@Override
	public List<Roles> getRoles() {
 		return rolesDao.getRoles();
	}

	@Override
	public Roles getRole(int id) {
 		return rolesDao.getRole(id);
	}

	@Override
	@Transactional
	public Roles addRole(Roles role) {
		return rolesDao.addRole(role);
	}

	@Override
	@Transactional
	public Roles updateRole(Roles role) {
 		return rolesDao.updateRole(role);
	}

	@Override
	@Transactional
	public Roles deleteRole(Roles role) {
 		return rolesDao.deleteRole(role);
	}

}
