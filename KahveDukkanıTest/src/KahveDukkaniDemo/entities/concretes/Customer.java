package KahveDukkaniDemo.entities.concretes;

import KahveDukkaniDemo.entities.abstracts.Entity;

public class Customer implements Entity{
	private int id ; 
	private String firstName;
	private String lastName;
	private long nationalityId;
	private int dateOfBirth;
	
	 
	public Customer(int id, String firstName, String lastName, long nationalityId, int dateTime) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateTime;
	}
	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateTime) {
		this.dateOfBirth = dateTime;
	}
}
