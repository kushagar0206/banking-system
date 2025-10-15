package com.kushagar0206.bankingsystem.service;

import com.kushagar0206.bankingsystem.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto addUser(UserDto userDto);

    List<UserDto> gatAllUser();

    UserDto getUserById(Long id);

    UserDto updateUser(Long id, UserDto userDto);

     String deleteUser(Long id);

}
