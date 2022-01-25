package mygroup.expensetracker.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name="category")
public class Category {
	@Id
	private Long id;
	@NonNull
	private String name;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private User user;
	
	public String getCategory() {
		return name;
	}
	
	public Long getId() {
		return id;
	}
}
