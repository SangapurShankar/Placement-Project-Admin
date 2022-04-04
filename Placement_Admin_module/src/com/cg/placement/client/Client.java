package com.cg.placement.client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.placement.entities.Admin;
public class Client {

	public static void main(String[] args) {
	
		/*Admin admin = new Admin();
		
		admin.setId(1);
		admin.setName("Shankar");
		admin.setPassword("Sangapur");
		
		
		
	
		System.out.println("Successfully Added");
		
		admin.getId();
		admin.getName();
		admin.getPassword();
		System.out.println("ID is : "+admin.getId());
		System.out.println("Name is : "+admin.getName());
		System.out.println("Password is : "+admin.getPassword());
*/
		
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		em.getTransaction().begin();
		Admin admin = new Admin();
		admin.setId(100);
		admin.setName("Shankar");
		admin.setPassword("Sangapur");
		
		em.persist(admin);
		em.getTransaction().commit();
		System.out.println("Successfully Added");
		
		em.close();
		fact.close();
		
	}
	}

