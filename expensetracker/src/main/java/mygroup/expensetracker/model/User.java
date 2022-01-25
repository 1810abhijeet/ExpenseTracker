package mygroup.expensetracker.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table(name="user")
public class User {
	@Id
	private Long id;
	private String name;
	private String email;

	@OneToMany
	private Set<Category> category;
}
