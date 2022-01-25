package mygroup.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mygroup.expensetracker.model.Expense;
import mygroup.expensetracker.repository.ExpenseRepository;

public class ExpenseService {
	
	@Autowired
	private ExpenseRepository expenserepository;

	public List<Expense> listAll(){
		return expenserepository.findAll();
	}
	
	public void save(Expense expense) {
		expenserepository.save(expense);
	}
	
	public Expense get(long id) {
		return expenserepository.findById(id).get();
	}
	
	
	public void delete(long id) {
		expenserepository.deleteById(id);
	}

}
