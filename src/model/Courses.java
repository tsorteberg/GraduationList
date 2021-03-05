package model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * @author Tom Sorteberg - tsorteberg
 * @autor Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 4, 2021
 */
@Entity
@Table(name="courses")
public class Courses {
	
	// Instance variable declaration.
	// id instance.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	// courseName instance.
	@Column(name="COURSE_NAME")
	private String courseName;
	
	// localDate instance.
	@Column(name="START_DATE")
	private LocalDate startDate;
	
	// credits instance.
	@Column(name="CREDITS")
	private int credits;
	
	// instructors instance.
	@ManyToOne (cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="INSTRUCTOR_ID")
	private Instructors instructor;

	/**
	 * Default constructor.
	 */
	public Courses() {
		super();
	}
	
	// To-do

}
