package com.vetsis.service;

import org.springframework.stereotype.Service;

import com.vetsis.entities.UserEntity;

public interface UserService{

	public Boolean saveUser(UserEntity userEntity);
	public UserEntity login(String userName, String password);
	
}
