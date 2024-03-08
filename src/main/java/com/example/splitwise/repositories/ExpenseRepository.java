package com.example.splitwise.repositories;

import com.example.splitwise.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

    @Query("SELECT e FROM Expense e " +
            "INNER JOIN ExpenseUser eu ON e.id = eu.expense.id AND eu.user.id = :userId " +
            "LEFT JOIN group_expenses ge ON e.id = ge.expense.id " +
            "WHERE ge.id IS NULL")
    List<Expense> findNonGroupExpensesForUser(@Param("userId") Long userId);

}
