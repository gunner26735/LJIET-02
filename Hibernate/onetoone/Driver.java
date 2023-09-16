package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Driver {
    public static void main(String[] args) {
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("Persistence");
        EntityManager em = ef.createEntityManager();

        em.getTransaction().begin();
        Student s1 = new Student();
        s1.setSname("XYZ");
        
        Address myAddress = new Address();
        myAddress.setCity("Abad");
        myAddress.setState("Gujarat");

        s1.setAddress(myAddress);

        em.persist(s1);
        em.getTransaction().commit();
        System.out.println("Added Successfully.....");
    }
}
