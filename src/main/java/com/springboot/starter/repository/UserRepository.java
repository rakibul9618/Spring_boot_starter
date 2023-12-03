package com.springboot.starter.repository;

import com.springboot.starter.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    //    Custom finder method
    public List<User> findByName(String name);

    public List<User> findByNameStartingWith(String name);

    //  Custom  JPQL query
    @Query("select u from User u")
    public List<User> getAllUser();

    @Query("select u from User u where u.name=:N")
    public List<User> getUserByName(@Param("N") String name);

    //  Custom Native query
    @Query(value = "select * from  user" , nativeQuery = true)
    public List<User> getUsers();

}
