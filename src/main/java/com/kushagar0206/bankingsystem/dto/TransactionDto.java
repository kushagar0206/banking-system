package com.kushagar0206.bankingsystem.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {

    private Long id;

    private double amount;

    private String sender;

    private String reciever;

    private String crDr;

    private double currentBalance;

    private DateTimeFormat date;



}
