package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.Courses;
/**
 * @author Tom Sorteberg - tsorteberg
 * @autor Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 4, 2021
 */
//Mirror ListItemHelper.java from 'ShoppingList Online with JPA Servlets JSP 2020.pdf'
public class CoursesHelper {

	// Instance variable declaration and initialization.
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("GraduationList");

	/**
	 * Default constructor.
	*/
	public CoursesHelper() {
	// TODO Auto-generated constructor stub
	}
		
	/**
	* Method that accepts a course to add.
	* @param courses: Required Courses object type.
	*/
	public void insertCourse(Courses courses) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(courses);
		em.getTransaction().commit();
		em.close();
		}
		
	/**
	* Method that returns Courses object of all objects in the database.
	* @return: List<Courses> object.
	*/
	@SuppressWarnings("unchecked")
	public List<Courses> showAllItems() {
		EntityManager em = emfactory.createEntityManager();
		List<Courses> allItems = em.createQuery("SELECT i FROM Courses i").getResultList();
		return allItems;
	}
		
	/**
	* Method that deletes the first Courses object from database.
	* @param toDelete: Required Courses object.
	*/
	public void deleteItem(Courses toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Courses> typedQuery = em.createQuery("select ci from Courses ci where ci.id = :selectedId", Courses.class);
		typedQuery.setParameter("selectedId", toDelete.getId());
		typedQuery.setMaxResults(1);
		Courses result = typedQuery.getSingleResult();
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
		
	/**
	 * Method that searches for database object via ID instance.
	 * @param idToEdit: Required Courses object.
	 * @return: Courses object.
	 */
	public Courses searchForCourseById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Courses found = em.find(Courses.class, idToEdit);
		em.close();
		return found;
	}

}
