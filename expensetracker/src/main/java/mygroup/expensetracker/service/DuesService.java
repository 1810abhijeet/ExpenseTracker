package mygroup.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mygroup.expensetracker.model.Dues;
import mygroup.expensetracker.repository.DuesRepository;

public class DuesService {
	
	@Autowired
	private DuesRepository duesrepository;

	public List<Dues> listAllByStartDate(){
		return duesrepository.findAllByOrderByStartDateAsc();
	}
	
	public List<Dues> listAllByDueDate(){
		return duesrepository.findAllByOrderByDueDateAsc();
	}
	
	public void save(Dues due) {
		duesrepository.save(due);
	}
	
	public Dues get(long id) {
		return duesrepository.findById(id).get();
	}
	
	
	public void delete(long id) {
		duesrepository.deleteById(id);
	}
}
