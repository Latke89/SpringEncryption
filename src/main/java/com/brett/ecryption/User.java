package com.brett.ecryption;

import javax.persistence.*;

/**
 * Created by Brett on 1/24/17.
 */
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue
	int id;

	@Column (nullable = false)
	String name;

	@Column (nullable = false)
	String password;

	public User() {
	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}
