package com.yupr.forum.controllers;

import com.yupr.forum.dao.UserDataRepository;
import com.yupr.forum.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Yura on 18.03.2017.
 */
@Controller
public class MainController {

    @Autowired
    private UserDataRepository userRepo;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello from first Spring servlet!";
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> showUsers(){
        return userRepo.getAllUsers();
    }

    @GetMapping("/users/{id}")
    @ResponseBody
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        return userRepo.getUser(id)
                .map(user -> ResponseEntity.ok().body(user))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/users/{id}")
    @ResponseBody
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User userData){
        return userRepo.updateUser(id, userData)
                .map(user -> ResponseEntity.ok().body(user))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/users")
    @ResponseBody
    public ResponseEntity<User> createUser(@RequestBody User userData){
        User user = userRepo.createUser(userData);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
