package com.qasim.calorie.api.Controller;

import java.util.*;
import com.qasim.calorie.api.Models.User;
import com.qasim.calorie.api.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user) {
        userRepo.save(user);
        return "Saved...";
    }

    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user) {
        if (userRepo.findById(id).isPresent()) {
            User updatedUser = userRepo.findById(id).get();
            updatedUser.setFirstName(user.getFirstName());
            updatedUser.setLastName(user.getLastName());
            updatedUser.setAge(user.getAge());
            updatedUser.setActivityLevel(user.getActivityLevel());
            userRepo.save(updatedUser);
            return "Updated...";
        }
        return "Error!";
    }

    public String deleteUser(@PathVariable long id) {
        if (userRepo.findById(id).isPresent()) {
            User deleteUser = userRepo.findById(id).get();
            userRepo.delete(deleteUser);
            return "Deleted user with id: " + id;
        }
        return "Error!";
    }
}
