package com.example.splitwise.dtos;

import com.example.splitwise.models.Transaction;
import lombok.Data;

import java.util.List;

@Data
public class SettleUserResponseDto {
    private ResponseStatus responseStatus;
    private List<Transaction> transactions;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
