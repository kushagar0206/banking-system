package com.kushagar0206.bankingsystem.controller;

import com.kushagar0206.bankingsystem.service.BankingServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class BankingController {

    public BankingServiceImpl bankingserviceimpl;

    @PutMapping("/add")
    public void addUser(){
        bankingserviceimpl.addUser(long id, String name, String mobileNo, String email);

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
