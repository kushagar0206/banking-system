package com.kushagar0206.bankingsystem.service;

import com.kushagar0206.bankingsystem.dto.TransactionDto;

import java.util.List;

public interface TransactionService {

    TransactionDto addTransaction(TransactionDto transactionDto);

    List<TransactionDto> getAllTransaction();

    TransactionDto getTransactionById(Long id);

}
