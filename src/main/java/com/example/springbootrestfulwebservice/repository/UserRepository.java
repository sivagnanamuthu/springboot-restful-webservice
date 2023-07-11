package com.example.springbootrestfulwebservice.repository;

import com.example.springbootrestfulwebservice.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
}
