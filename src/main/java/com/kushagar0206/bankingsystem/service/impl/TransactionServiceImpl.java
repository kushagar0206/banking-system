package com.kushagar0206.bankingsystem.service.impl;

import com.kushagar0206.bankingsystem.dto.TransactionDto;
import com.kushagar0206.bankingsystem.model.Transaction;
import com.kushagar0206.bankingsystem.repository.TransactionRepository;
import com.kushagar0206.bankingsystem.service.TransactionService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionDto convertToDto(Transaction transaction) {
        return new TransactionDto(transaction.getId(), transaction.getAmount(), transaction.getSender(), transaction.getReciever(), transaction.getCrDr(), transaction.getCurrentBalance(), transaction.getDate());
    }

    public Transaction convertToEntity(TransactionDto transactionDto) {
        return new Transaction(transactionDto.getId(), transactionDto.getAmount(), transactionDto.getSender(), transactionDto.getReciever(), transactionDto.getCrDr(), transactionDto.getCurrentBalance(), transactionDto.getDate());
    }

    @Override
    public TransactionDto addTransaction(TransactionDto transactionDto) {
        Transaction transaction = convertToEntity(transactionDto);
        Transaction save = transactionRepository.save(transaction);
        return convertToDto(save);
    }

    @Override
    public List<TransactionDto> getAllTransaction() {
        return transactionRepository.findAll()
                .stream().map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public TransactionDto getTransactionById(Long id) {
        return transactionRepository.findAllById(id)
                .map(this::convertToDto)
                .orElse(null);
    }

}
