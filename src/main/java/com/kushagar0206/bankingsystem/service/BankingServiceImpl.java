package com.kushagar0206.bankingsystem.service;

import com.kushagar0206.bankingsystem.dto.userDto;
import com.kushagar0206.bankingsystem.model.User;
import com.kushagar0206.bankingsystem.repository.BankingRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankingServiceImpl implements BankingService{

    BankingRepository bankingrepository;


    public BankingServiceImpl(BankingRepository bankingrepository){
        this.bankingrepository = bankingrepository;
    }

    @Override
    public void addUser( userDto userdto) {
        bankingrepository.save(userdto);
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
