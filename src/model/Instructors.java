package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Tom Sorteberg - tsorteberg
 * @autor Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 4, 2021
 */
@Entity
@Table(name="instructors")
public class Instructors {
	
	// Instance variable declaration.
	// id instance.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="INSTRUCTOR_ID")
	private int id;
	
	// firstName instance.
	@Column(name="FIRST_NAME")
	private String firstName;
	
	// lastName instance.
	@Column(name="LAST_NAME")
	private String lastName;
	
	/**
	 * Default constructor.
	 */
	public Instructors() {
		super();
	}
	
	/**
	 * Primary constructor.
	 * @param id: Required integer.
	 * @param firstName: Required string.
	 * @param lastName: Required string.
	 */
	public Instructors(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Get method for id instance.
	 * @return: integer.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Get method for firstName instance.
	 * @return: string.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Get method for lastName instance.
	 * @return: string.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Set method for id instance.
	 * @param id: Required integer.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Set method for firstName instance.
	 * @param id: Required string.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Set method for lastName instance.
	 * @param id: Required string.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Default toString() method.
	 */
	@Override
	public String toString() {
		return "Instructors [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}