package com.kushagar0206.bankingsystem.controller;

import com.kushagar0206.bankingsystem.dto.TransactionDto;
import com.kushagar0206.bankingsystem.service.TransactionService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PutMapping("/add")
    public TransactionDto addTransaction(@RequestBody TransactionDto transactionDto) {
        return transactionService.addTransaction(transactionDto);
    }

    @GetMapping("/get")
    public List<TransactionDto> getAllTransaction() {
        return transactionService.getAllTransaction();
    }

    @GetMapping("/get/{id}")
    public TransactionDto getTransactionById(@PathVariable Long id) {
        return transactionService.getTransactionById(id);
    }
}
