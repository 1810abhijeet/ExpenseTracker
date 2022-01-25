package mygroup.expensetracker.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name="expense")
public class Expense {
	@Id
	private long id;
	
	//Name of the expense
	@NonNull
	private String name;
	
	//Reason for the expense made
	private String description;
	
	//Date of expense
	@NonNull
	private Instant expensedate;
	
	//location of expense
	private String location;
	
	//How was the expense made
	@ManyToOne
	private Category category;
	
	//Total amount to be paid
	@NonNull
	private Double total;
	
	//Actual amount paid
	@NonNull
	private Double amount_paid;
	
	//Amount remaining
	private Double remaining_amount;
	
	//Repayment Date
	private Instant repayment_date;
	
	@JsonIgnore
	@ManyToOne
	private User user;
	
	
	public long getId() {
		return id;
	}
	
	public String getExpenseName() {
		return name;
	}
	
	public String getReason() {
		return description;
	}
	
	public String getLocation() {
		return location;
	}
	
	public Instant getDate()
	{
		return expensedate;
	}
	
	public Category getCategory() {
		return category;
	}
	
	
}


