package com.example.finalspring.controller;

import com.example.finalspring.entity.User;
import com.example.finalspring.model.dto.UserDTO;
import com.example.finalspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;


@RestController()
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

//    public UserController(UserService userService){
//        this.userService = userService;
//    }
    @GetMapping("")
    public ResponseEntity<?> getListUser(){
        List<UserDTO> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") int Id){
        UserDTO result = userService.getUserById(Id);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchUser(@RequestParam(value = "name",required = false,defaultValue="") String name){
        List<UserDTO> users = userService.getListUserByName(name);
        return ResponseEntity.ok(users);
    }
}