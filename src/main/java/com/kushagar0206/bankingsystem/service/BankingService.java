package com.kushagar0206.bankingsystem.service;

import com.kushagar0206.bankingsystem.dto.userDto;
import org.springframework.stereotype.Service;

public interface BankingService {

    public void addUser(userDto userDto);

    public void gatAllUser();

    public void getUserById();

    public void updateUser();

    public void deleteUser();

}
