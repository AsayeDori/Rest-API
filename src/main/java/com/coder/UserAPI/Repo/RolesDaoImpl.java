package com.coder.UserAPI.Repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coder.UserAPI.Entity.Roles;

@Repository
public class RolesDaoImpl implements RolesDao {
	
	@Autowired
	EntityManager em;

	@Override
	public List<Roles> getRoles() {
		 return em.createQuery("From Roles", Roles.class).getResultList();
	}

	@Override
	public Roles getRole(int id) {
		return em.find(Roles.class, id);
	}

	@Override
	public Roles addRole(Roles role) {
		em.persist(role);
 		return role;
	}

	@Override
	public Roles updateRole(Roles role) {
		 return em.merge(role);
	}

	@Override
	public Roles deleteRole(Roles role) {
		 em.remove(role);
 		return role;
	}

}
