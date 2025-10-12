package com.kushagar0206.bankingsystem.controller;

import com.kushagar0206.bankingsystem.dto.userDto;
import com.kushagar0206.bankingsystem.model.User;
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
    public User addUser(@RequestBody userDto userdto){
    return bankingserviceimpl.addUser(userdto);
    }



    @GetMapping("/all")
    public void getAllUser(){
    }

@GetMapping("/{id}")
public void getUserById(@PathVariable long id){


}

@PutMapping("/Update")
    public void updateUser(){


}

@DeleteMapping("/delete{id}")
    public void deleteUser(@PathVariable long id){


}

}
