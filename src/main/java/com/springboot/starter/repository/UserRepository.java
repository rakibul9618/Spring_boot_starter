package com.springboot.starter.repository;

import com.springboot.starter.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {}
