package com.kushagar0206.bankingsystem.repository;

import com.kushagar0206.bankingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankingRepository extends JpaRepository<User, Long> {

}
