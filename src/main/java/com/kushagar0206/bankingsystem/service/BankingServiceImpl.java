package com.kushagar0206.bankingsystem.service;

import com.kushagar0206.bankingsystem.repository.BankingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BankingServiceImpl implements BankingService{

    private BankingRepository bankingRepository;

    @Override
    public void addUser() {
        bankingRepository.save();
    }

    @Override
    public void gatAllUser() {

    }

    @Override
    public void getUserById() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
