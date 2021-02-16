package com.oauth2.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oauth2.model.User;



@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
