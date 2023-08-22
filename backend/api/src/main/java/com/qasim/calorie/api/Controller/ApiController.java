package com.qasim.calorie.api.Controller;

import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qasim.calorie.api.Models.User;
import com.qasim.calorie.api.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
public class ApiController {

    ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

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
        String json = "";
        try {
            // convert user object to json string and return it
            json =  ow.writeValueAsString(user);
        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "Saved... \n\n" + json;
    }

    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user) {
        if (userRepo.findById(id).isPresent()) {
            User updatedUser = userRepo.findById(id).get();
            updatedUser.setAge(user.getAge());
            updatedUser.setActivityLevel(user.getActivityLevel());
            userRepo.save(updatedUser);
            return "Updated...";
        }
        return "Error!";
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteUser(@PathVariable long id) {
        if (userRepo.findById(id).isPresent()) {
            User deleteUser = userRepo.findById(id).get();
            userRepo.delete(deleteUser);
            return "Deleted user with id: " + id;
        }
        return "Error!";
    }
}
