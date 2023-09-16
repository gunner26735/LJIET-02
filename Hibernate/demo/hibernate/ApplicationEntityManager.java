package demo.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ApplicationEntityManager {
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Persistence");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        Customer c1 = new Customer();
        c1.setFirstName("PQR");
        c1.setLastName("LMN");
        
        entityManager.persist(c1);
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}
