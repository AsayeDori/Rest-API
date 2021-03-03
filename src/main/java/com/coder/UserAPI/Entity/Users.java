package com.coder.UserAPI.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.hateoas.RepresentationModel;
 
@Entity
@Table(name = "users")
public class Users extends RepresentationModel<Users>{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;	
	@Column(name="username")
	private String username;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
//	@ManyToMany(mappedBy = "roles")
//	private Set<Roles> roles; 
	
	public Users() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public Set<Roles> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Set<Roles> roles) {
//		this.roles = roles;
//	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", name=" + name + ", password=" + password
				+ ", email=" + email + "]";
	}
}
