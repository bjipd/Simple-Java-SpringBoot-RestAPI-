package com.example.RestAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestAPI.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
