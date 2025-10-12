package com.kushagar0206.bankingsystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String mobileNo;

    private String email;

}
