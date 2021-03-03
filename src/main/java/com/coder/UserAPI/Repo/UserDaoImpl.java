package com.coder.UserAPI.Repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import com.coder.UserAPI.Entity.Users;

@RequestScope
@Repository
public class UserDaoImpl implements UsersDao {

	@Autowired 	 
	EntityManager em;
	
	@Override
	public List<Users> getUsers() {
		List<Users> user = em.createQuery("From Users", Users.class).getResultList();
		return user;
	}

	@Override
	public Users searchUser(int id) {
		Users user = em.find(Users.class, id);
		return user;
	}

	@Override
	public Users deleteUser(Users user) {
		em.remove(user);
		return user;
	}

	@Override
	public Users putUser(Users user) {
		em.merge(user);
		return user;
	}

	@Override
	public Users addUser(Users user) {
		em.persist(user);
		return user;
	}

}
