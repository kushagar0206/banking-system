package com.kushagar0206.bankingsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    private String sender;

    private String reciever;

    private String type;

    @Column(name = "current_balance")
    private double currentBalance;

    private LocalDateTime date = LocalDateTime.now();
}
