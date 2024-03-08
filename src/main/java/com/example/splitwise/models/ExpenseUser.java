package com.example.splitwise.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ExpenseUser extends BaseModel{

    @ManyToOne(fetch = FetchType.EAGER)
    private Expense expense;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    private double amount;
    @Enumerated(value = EnumType.ORDINAL)
    private ExpenseType expenseType;

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }
}
