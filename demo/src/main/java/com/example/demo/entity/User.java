package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
	private String email;
	public Long getId() {
		return id;
	}
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 public User() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public User(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	 }


}
