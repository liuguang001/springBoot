package com.example.jpa.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jpa.domain.User;

public interface UserRepositry extends JpaRepository<User, Integer>{
	public List<User> findAll();
}
