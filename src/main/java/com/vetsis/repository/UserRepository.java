package com.vetsis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.vetsis.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	@Query("SELECT u FROM users u where u.username = :username and u.password = :password")
	UserEntity findUserByUsernameAndPassword(String username, String password);
}