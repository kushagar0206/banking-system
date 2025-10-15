package com.kushagar0206.bankingsystem.controller;

import com.kushagar0206.bankingsystem.dto.UserDto;
import com.kushagar0206.bankingsystem.service.BankingServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class BankingController {

    public BankingServiceImpl bankingserviceimpl;

    public BankingController(BankingServiceImpl bankingserviceimpl) {
        this.bankingserviceimpl = bankingserviceimpl;
    }

    @PostMapping("/add")
    public UserDto addUser(@RequestBody UserDto userdto){
    return bankingserviceimpl.addUser(userdto);
    }

    @GetMapping("/get")
    public List<UserDto> getAllUser(){
       return bankingserviceimpl.gatAllUser();
    }

    @GetMapping("/get/{id}")
    public UserDto getUserById(@PathVariable Long id){
        return bankingserviceimpl.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public UserDto updateUser(@PathVariable Long id, @RequestBody UserDto userDto){
        return bankingserviceimpl.updateUser(id, userDto);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id){
        return bankingserviceimpl.deleteUser(id);
    }

}
