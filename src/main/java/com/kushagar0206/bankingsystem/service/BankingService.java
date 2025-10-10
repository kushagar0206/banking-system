package com.kushagar0206.bankingsystem.service;

import org.springframework.stereotype.Service;

public interface BankingService {

    public void addUser(long id, String name, String mobileNo, String email);

    public void gatAllUser();

    public void getUserById();

    public void updateUser();

    public void deleteUser();

}
