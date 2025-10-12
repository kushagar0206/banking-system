package com.kushagar0206.bankingsystem.controller;

import com.kushagar0206.bankingsystem.dto.userDto;
import com.kushagar0206.bankingsystem.service.BankingServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class BankingController {

    public BankingServiceImpl bankingserviceimpl;

    public BankingController(BankingServiceImpl bankingserviceimpl) {
        this.bankingserviceimpl = bankingserviceimpl;
    }

    @PutMapping("/add")
    public void addUser(userDto userdto){

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
