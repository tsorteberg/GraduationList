package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Instructors;

/**
 * @author Tom Sorteberg - tsorteberg
 * @autor Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 9, 2021
 */
public class InstructorsHelper {
	
	// Instantiate EntityManagerFactory object.
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("GraduationList");

	/**
	 * Default constructor.
	 */
	public InstructorsHelper() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Method that searches for database object via ID instance.
	 * @param idToEdit: Required Instructors object.
	 * @return: Instructors object.
	 */
	public Instructors searchForCourseById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Instructors found = em.find(Instructors.class, idToEdit);
		em.close();
		return found;
	}
	
	/**
	 * Method that updates database objects.
	 * @param toEdit: Required Instructors object.
	 */
	public void updateItem(Instructors toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
}
