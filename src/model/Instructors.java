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
	
	// To-do
}
