package com.vetsis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vetsis.entities.UserEntity;
import com.vetsis.service.UserService;

@RestController
public class loginController {

	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public ResponseEntity<UserEntity> login(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "password") String password) {
		UserEntity userEntity = new UserEntity(userName);
		
		return new ResponseEntity<>(userEntity, HttpStatus.OK);
	}
	
	@PostMapping("/new-user")
	public ResponseEntity<UserEntity> newUser(@RequestBody UserEntity userEntity){
       if (userService.saveUser(userEntity))
    	   return new ResponseEntity<>(userEntity,HttpStatus.CREATED);
       else
    	   return new ResponseEntity<>(userEntity,HttpStatus.CONFLICT);

	}
	
	
}
