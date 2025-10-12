package com.kushagar0206.bankingsystem.service;

import com.kushagar0206.bankingsystem.dto.userDto;
import com.kushagar0206.bankingsystem.model.User;

import java.util.List;

public interface BankingService {

    User addUser(userDto userDto);

    List<User> gatAllUser();

    userDto getUserById(Long id);

    void updateUser();

     void deleteUser();

}
