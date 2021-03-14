package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Courses;
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
	public Instructors searchForInstructorById(int idToEdit) {
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
	
	/**
	* Method that returns Instructor object of all objects in the database.
	* @return: List<Courses> object.
	*/
	@SuppressWarnings("unchecked")
	public List<Courses> showAllItems() {
		EntityManager em = emfactory.createEntityManager();
		List<Courses> allItems = em.createQuery("SELECT i FROM Instructors i").getResultList();
		return allItems;
	}
	
	public void deleteItem(Instructors toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Instructors> typedQuery = em.createQuery("select i from Instructors i where i.id = :selectedId", Instructors.class);
		typedQuery.setParameter("selectedId", toDelete.getId());
		typedQuery.setMaxResults(1);
		Instructors result = typedQuery.getSingleResult();
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	public void insertInstructor(Instructors instructor) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(instructor);
		em.getTransaction().commit();
		em.close();
		}
}
