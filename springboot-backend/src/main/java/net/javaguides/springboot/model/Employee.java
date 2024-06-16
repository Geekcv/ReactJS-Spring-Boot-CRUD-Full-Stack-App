package net.javaguides.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// import jakarta.persistence.*;

// @Entity
// @Table(name = "employees")
@Document(collection = "employees")
public class Employee {

	@Id
	private String id; // Use String type for MongoDB ID
	private String firstName;
	private String lastName;
	private String emailId;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	// FOR My SQL OR RDMS
	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// private long id;

	// @Column(name = "first_name")
	// private String firstName;

	// @Column(name = "last_name")
	// private String lastName;

	// @Column(name = "email_id")
	// private String emailId;

	// public Employee() {

	// }

	// public Employee(String firstName, String lastName, String emailId) {
	// super();
	// this.firstName = firstName;
	// this.lastName = lastName;
	// this.emailId = emailId;
	// }

	// public long getId() {
	// return id;
	// }

	// public void setId(long id) {
	// this.id = id;
	// }

	// public String getFirstName() {
	// return firstName;
	// }

	// public void setFirstName(String firstName) {
	// this.firstName = firstName;
	// }

	// public String getLastName() {
	// return lastName;
	// }

	// public void setLastName(String lastName) {
	// this.lastName = lastName;
	// }

	// public String getEmailId() {
	// return emailId;
	// }

	// public void setEmailId(String emailId) {
	// this.emailId = emailId;
	// }
}
