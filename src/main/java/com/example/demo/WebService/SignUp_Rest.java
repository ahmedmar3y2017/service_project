package com.example.demo.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.User;
import com.example.demo.service.SignUp_Service;

@RestController
@RequestMapping("/rest")
public class SignUp_Rest {
	@Autowired
	SignUp_Service sign;

	// save user when signup
	@RequestMapping(value = "/signup/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> Save_User(@RequestBody User user) {
		if (user == null) {
			return new ResponseEntity<String>("Please add employee details !!", HttpStatus.METHOD_FAILURE);

		}

		if (user.getEmail() == "" || user.getPassword() == "") {

			return new ResponseEntity<String>("Please provide the Email and password", HttpStatus.BAD_REQUEST);

		}
		sign.save_User(user);

		return new ResponseEntity<String>("Done create User", HttpStatus.CREATED);
     
		
		
		//ahmed
	}

	// check email before sign up
	@RequestMapping(value = "/signup/check/{email}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User Check_Email(@PathVariable("email") String email) {

		System.out.println(email);
		return sign.check_Mail(email + ".com");

	}

}
