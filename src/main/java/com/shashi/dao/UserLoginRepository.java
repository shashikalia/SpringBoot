package com.shashi.dao;

import org.springframework.data.repository.CrudRepository;

import com.shashi.entity.UserLogin;


public interface UserLoginRepository extends CrudRepository<UserLogin, Long> {
    public UserLogin findByUserName(String username);
    
}
