package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.User;
import com.example.demo.dao.SignUp_Dao_impl;

@Service
public class SignUp_Service {
	@Autowired
	SignUp_Dao_impl signUp_Dao_impl;

	public void save_User(User user_Entities) {

		signUp_Dao_impl.save_User(user_Entities);

	}

	public User check_Mail(String email) {

		return signUp_Dao_impl.check_Mail(email);

	}
}
