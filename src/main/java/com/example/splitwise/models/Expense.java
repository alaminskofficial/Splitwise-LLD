package com.example.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Expense extends BaseModel{
    private double amount;
    private Date addedAt;
    private String description;
    private String proofUrl;

    @OneToMany(mappedBy = "expense", fetch = FetchType.EAGER)
    private List<ExpenseUser> expenseUsers;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProofUrl() {
        return proofUrl;
    }

    public void setProofUrl(String proofUrl) {
        this.proofUrl = proofUrl;
    }

    public List<ExpenseUser> getExpenseUsers() {
        return expenseUsers;
    }

    public void setExpenseUsers(List<ExpenseUser> expenseUsers) {
        this.expenseUsers = expenseUsers;
    }
}
