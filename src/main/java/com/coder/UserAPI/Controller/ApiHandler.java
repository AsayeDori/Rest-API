package com.coder.UserAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coder.UserAPI.Entity.Roles;
import com.coder.UserAPI.Entity.Users;
import com.coder.UserAPI.Service.ServiceDao;

@RestController
 public class ApiHandler {

	@Autowired
	ServiceDao serviceDao;
	
	@GetMapping("/users")
	List<Users> getUsers(){
		return serviceDao.getUsers();
	}
	
	@GetMapping("/users/{id}")
	Users searchUser(@PathVariable("id") int id) throws Exception {
 			Users user = serviceDao.searchUser(id);	
			if(user == null) {
				throw new Exception();
				}
			user.add(Link.of("http://localhost:8081/users"));
		return user;
	}
	
	@DeleteMapping("/users/{id}")
	Users deleteUser(@PathVariable("id") int id) {
		Users user = serviceDao.searchUser(id);
		return serviceDao.deleteUser(user);
	}
	
	@PutMapping("/users")
	Users putUser(@RequestBody Users user) {
		//Users updateUser = serviceDao.searchUser(user.getUserId());
		System.out.println(user.getUserId());
		return serviceDao.putUser(user);
	}
	
	@PostMapping("/users")
	Users addUser(@RequestBody Users user) {
		return serviceDao.putUser(user);
	}
	
	@GetMapping("/roles")
	List<Roles> getRoles(){
		return serviceDao.getRoles();
	}
	
	@GetMapping("/roles/{id}")
	Roles searchRole(@PathVariable("id") int id) {
		return serviceDao.getRole(id);
	}
	
	@DeleteMapping("/roles/{id}")
	Roles deleteRole(@PathVariable("id") int id) {
		Roles role = serviceDao.getRole(id);
		return serviceDao.deleteRole(role);
	}
	
	@PutMapping("/roles")
	Roles putRole(@RequestBody Roles role) {
 		System.out.println(role.getId());
		return serviceDao.updateRole(role);
	}
	
	@PostMapping("/roles")
	Roles addUser(@RequestBody Roles role) {
		return serviceDao.updateRole(role);
	}
}
