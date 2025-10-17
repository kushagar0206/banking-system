package com.kushagar0206.bankingsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {

    private Long id;

    private double amount;

    private String sender;

    private String reciever;

    private String type;

    private double currentBalance;

    private LocalDateTime date;



}
