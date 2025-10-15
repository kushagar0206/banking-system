package com.kushagar0206.bankingsystem.service;

import com.kushagar0206.bankingsystem.dto.UserDto;
import com.kushagar0206.bankingsystem.model.User;

import java.util.List;

public interface BankingService {

    UserDto addUser(UserDto userDto);

    List<UserDto> gatAllUser();

    UserDto getUserById(Long id);

    UserDto updateUser(Long id, UserDto userDto);

     String deleteUser(Long id);

}
