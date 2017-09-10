package com.example.demo.WebService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.User;
import com.example.demo.service.Login_Service;

@RestController
@RequestMapping("/rest")
public class Login_Rest {
	@Autowired
	Login_Service login_Service;

	@RequestMapping(value = "/login/get/{email}/{pass}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User Get(@PathVariable("email") String email, @PathVariable("pass") String pass) {

//		System.out.println("Done ya Man ");

		return login_Service.get(email, pass);

	}
}
