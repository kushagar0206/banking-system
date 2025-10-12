package com.kushagar0206.bankingsystem.service;

import com.kushagar0206.bankingsystem.dto.userDto;
import com.kushagar0206.bankingsystem.model.User;
import com.kushagar0206.bankingsystem.repository.BankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BankingServiceImpl implements BankingService{

    private BankingRepository bankingrepository;


    public BankingServiceImpl(BankingRepository bankingrepository){
        this.bankingrepository = bankingrepository;
    }

    @Override
    public User addUser( userDto userdto) {
        User user = new User();
        user.setName(userdto.getName());
        user.setMobileNo(userdto.getMobileNo());
        user.setEmail(userdto.getEmail());
        return bankingrepository.save(user);
    }

    @Override
    public List<User> gatAllUser() {
       List<User> lu = bankingrepository.findAll();
       return lu;
    }

    @Override
    public userDto getUserById(Long id) {
        User user = bankingrepository.findById(id).orElse(null);
        if(user == null)
            return null;
        userDto userdto = new userDto();
        userdto.setName(user.getName());
        userdto.setMobileNo(user.getMobileNo());
        userdto.setEmail(user.getEmail());
        return userdto;
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
