package net.javaguides.springboot.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="users")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   
   @Column(name ="first_name")
   private String firstName;
   
   @Column(name ="last_name")
   private String lastName;
   
   @Column(name ="email")
   private String email;
   
   @Column(name ="position")
   private String position;
   
   @Column(name ="department")
   private String department;
   
   public User() {
	   
   }
public User(String firstName, String lastName, String email, String position, String department) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.position = position;
	this.department = department;
}
public long getId() {
	return id;
}
public void setId(long id) {
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
   
}
