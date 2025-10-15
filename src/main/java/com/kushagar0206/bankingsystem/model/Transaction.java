package com.kushagar0206.bankingsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    private String sender;

    private String reciever;

    @Column(name = "credit/debit")
    private String crDr;

    @Column(name = "current_balance")
    private double currentBalance;

    private DateTimeFormat date;
}
