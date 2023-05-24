package com.nagarro.sampleapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user1) {
        // Logic to create a user
    	Long id = (long) 11223344;
    	User user = new User();
        // Retrieve the user from the database or any other source
        user.setId(id);
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");
        return user;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id) {
        // Logic to retrieve a user by ID
        User user = new User();
        // Retrieve the user from the database or any other source
        user.setId(id);
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");
        return user;
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User updatedUser) {
        // Logic to update a user
        // Retrieve the user by ID and update its properties
        User user = new User();
        // Update the user's properties with the values from updatedUser
        user.setId(id);
        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());
        return user;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        // Logic to delete a user by ID
    }

}

