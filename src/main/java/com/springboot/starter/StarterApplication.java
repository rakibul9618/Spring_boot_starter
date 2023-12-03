package com.springboot.starter;

import com.springboot.starter.entities.User;
import com.springboot.starter.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class StarterApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StarterApplication.class, args);

        UserRepository userRepo = context.getBean(UserRepository.class);

        /*
         * Create user
         */
        // User user = new User( "Rakib", "Dhaka", "active");
        // User returnData = userRepo.save(user);

        /*
         * Bulk create
         */
//        User user2 = new User("Rahad", "Mymensingh", "Developer");
//        User user3 = new User("Shawon", "Dhaka", "Engineer");
//        ArrayList<User> users = new ArrayList<>(List.of(user2, user3));
//        Iterable<User> saved = userRepo.saveAll(users);
//        saved.forEach(System.out::println);

        /*
         * Get and update user
         */

//        Optional<User> userOptional = userRepo.findById(52);
//        User user = userOptional.get();
//        user.setStatus("Student");
//        User updatedUser = userRepo.save(user);
//        System.out.println(updatedUser);

        /*
         * Get all user
         */
//        Iterable<User> allUser = userRepo.findAll();
//        allUser.forEach(System.out::println);

        /*
         * Delete user
         */
//        userRepo.deleteById(2);
//        System.out.println("Deleted");


//    Custom finder method
//        List<User> name = userRepo.findByName("Rakib");
//        System.out.println(name);

//        List<User> userList = userRepo.findByNameStartingWith("R");
//        System.out.println(userList);

//      Custom  JPQL query
//        List<User> allUser = userRepo.getAllUser();
//        allUser.forEach(System.out::println);

//        List<User> name = userRepo.getUserByName("Rakib");
//        System.out.println(name);

//          Custom Native query
//        List<User> allUser = userRepo.getUsers();
//        allUser.forEach(System.out::println);

    }
}
