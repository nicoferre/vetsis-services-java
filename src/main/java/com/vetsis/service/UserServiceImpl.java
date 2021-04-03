package com.vetsis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vetsis.entities.UserEntity;
import com.vetsis.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Boolean saveUser(UserEntity userEntity) {
		UserEntity user = userRepository.save(userEntity);
		if(user != null) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public UserEntity login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
