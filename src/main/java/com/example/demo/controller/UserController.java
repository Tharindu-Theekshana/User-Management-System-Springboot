package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getUsers")
    public List<UserDto> getUser (){

        return userService.getAllUsers();
    }

    @PostMapping("/addUsers")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @PutMapping("/updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUSer(@PathVariable int userId){
        return userService.deleteUser(userId);
    }

    @GetMapping("/displayUSer/{userId}")
    public UserDto displayUser(@PathVariable int userId){
        return userService.displayUser(userId);
    }







}
