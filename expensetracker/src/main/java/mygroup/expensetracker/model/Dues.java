package mygroup.expensetracker.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import javax.persistence.Id;

@Entity
@Table(name="dues")
public class Dues {
	@Id
	private long id;
	private String name;
	private String description;
	private Instant start_date;
	private Instant due_date;
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Instant getStartDate()
	{
		return start_date;
	}	
	
	public Instant getDueDate()
	{
		return due_date;
	}

}
