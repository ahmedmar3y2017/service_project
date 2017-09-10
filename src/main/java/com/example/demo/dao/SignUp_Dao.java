package com.example.demo.dao;

import com.example.demo.Entities.User;

public interface SignUp_Dao {

	public void save_User(User user);

	public User check_Mail(String email);

}
