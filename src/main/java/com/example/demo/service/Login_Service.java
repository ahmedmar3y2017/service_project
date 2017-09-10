package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.User;
import com.example.demo.dao.Login_Dao_impl;

@Service
public class Login_Service {
	@Autowired
	Login_Dao_impl login_Dao_impl;

	public User get(String email, String pass) {

		return login_Dao_impl.get(email, pass);

	}
}
