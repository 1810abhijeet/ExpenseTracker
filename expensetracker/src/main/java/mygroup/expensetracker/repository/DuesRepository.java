package mygroup.expensetracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import mygroup.expensetracker.model.Dues;

public interface DuesRepository extends JpaRepository<Dues,Long>{

	public List<Dues> findAllByOrderByStartDateAsc();
	public List<Dues> findAllByOrderByDueDateAsc();
}
