package com.example.demo.dao;

import com.example.demo.Entities.User;

public interface Login_Dao {

	public User get(String email, String pass);

}
