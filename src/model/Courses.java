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
import javax.persistence.OneToOne;
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
	@Column(name="COURSE_ID")
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
	@OneToOne (cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="INSTRUCTOR_ID")
	private Instructors instructor;

	/**
	 * Default constructor.
	 */
	public Courses() {
		super();
	}
	
	/**
	 * Primary constructor.
	 * @param id: Required integer.
	 * @param courseName: Required string.
	 * @param startDate: Required LocalDate.
	 * @param credits: Required integer.
	 * @param instructor: Required Instructors object.
	 */
	public Courses(int id, String courseName, LocalDate startDate, int credits, Instructors instructor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.startDate = startDate;
		this.credits = credits;
		this.instructor = instructor;
	}
	
	/**
	 * Overloaded constructor.
	 * @param courseName: Required string.
	 * @param startDate: Required LocalDate.
	 * @param credits: Required integer.
	 * @param instructor: Required Instructors object.
	 */
	public Courses(String courseName, LocalDate startDate, int credits, Instructors instructor) {
		super();
		this.courseName = courseName;
		this.startDate = startDate;
		this.credits = credits;
		this.instructor = instructor;
	}
	
	/**
	 * Get method for id instance.
	 * @return: integer.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Get method for courseName instance.
	 * @return: string.
	 */
	public String getCourseName() {
		return courseName;
	}
	
	/**
	 * Get method for startDate instance.
	 * @return: LocalDate.
	 */
	public LocalDate getStartDate() {
		return startDate;
	}
	
	/**
	 * Get method for credits instance.
	 * @return: integer.
	 */
	public int getCredits() {
		return credits;
	}
	
	/**
	 * Get method for instructor instance.
	 * @return: Instructors object.
	 */
	public Instructors getInstructor() {
		return instructor;
	}
	
	/**
	 * Set method for id instance.
	 * @param id: Required integer.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Set method for courseName instance.
	 * @param id: Required string.
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	/**
	 * Set method for startDate instance.
	 * @param id: Required LocalDate.
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	/**
	 * Set method for credits instance.
	 * @param id: Required integer.
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	/**
	 * Set method for instructor instance.
	 * @param id: Required Instructors object.
	 */
	public void setInstructor(Instructors instructor) {
		this.instructor = instructor;
	}
	
	/**
	 * Default toString() method.
	 */
	@Override
	public String toString() {
		return "Courses [id=" + id + ", courseName=" + courseName + ", startDate=" + startDate + ", credits=" + credits
				+ ", instructor=" + instructor + "]";
	}
}