package com.kushagar0206.bankingsystem.service;

import com.kushagar0206.bankingsystem.dto.UserDto;
import com.kushagar0206.bankingsystem.model.User;
import com.kushagar0206.bankingsystem.repository.BankingRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankingServiceImpl implements BankingService {

    private BankingRepository bankingrepository;


    public BankingServiceImpl(BankingRepository bankingrepository) {
        this.bankingrepository = bankingrepository;
    }

    private UserDto convertToDTO(User user){
        return new UserDto(user.getId(), user.getName(), user.getMobileNo(), user.getEmail());
    }


    private User convertToEntity(UserDto userDto){
        User user = new User(userDto.getId(), userDto.getName(), userDto.getMobileNo(), userDto.getEmail());
//        user.setId(userDto.getId());
//        user.setName(userDto.getName());
//        user.setMobileNo(userDto.getMobileNo());
//        user.setName(userDto.getEmail());
        return user;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = convertToEntity(userDto);
       User saved = bankingrepository.save(user);
       return convertToDTO(saved);
    }

    @Override
    public List<UserDto> gatAllUser() {
        return bankingrepository.findAll()
                .stream().map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto getUserById( Long id) {
        return bankingrepository.findById(id)
                .map(this::convertToDTO)
                .orElse(null);
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        User user = bankingrepository.findById(id).orElseThrow();
        user.setName(userDto.getName());
        user.setMobileNo(userDto.getMobileNo());
        user.setEmail(userDto.getEmail());
        User update = bankingrepository.save(user);
        return convertToDTO(update);
    }

    @Override
    public String deleteUser(Long id) {
        bankingrepository.deleteById(id);
        return "User Delete Successfully";

    }
}
