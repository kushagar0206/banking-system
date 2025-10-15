package com.kushagar0206.bankingsystem.controller;

import com.kushagar0206.bankingsystem.dto.UserDto;
import com.kushagar0206.bankingsystem.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceimpl;

    @PostMapping("/add")
    public UserDto addUser(@RequestBody UserDto userdto){
    return userServiceimpl.addUser(userdto);
    }

    @GetMapping("/get")
    public List<UserDto> getAllUser(){
       return userServiceimpl.gatAllUser();
    }

    @GetMapping("/get/{id}")
    public UserDto getUserById(@PathVariable Long id){
        return userServiceimpl.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public UserDto updateUser(@PathVariable Long id, @RequestBody UserDto userDto){
        return userServiceimpl.updateUser(id, userDto);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id){
        return userServiceimpl.deleteUser(id);
    }

}
