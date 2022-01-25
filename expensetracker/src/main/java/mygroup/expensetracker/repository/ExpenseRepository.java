package mygroup.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mygroup.expensetracker.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}
