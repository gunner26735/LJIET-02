package assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Driver {
    public static void main(String[] args) {
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("Persistence");
        EntityManager em = ef.createEntityManager();

        em.getTransaction().begin();
        
        Citizen c1 =new Citizen();
        c1.setName("PQR");
        c1.setAge(30);

        Passport p1 = new Passport();
        p1.setIssuer("Kerala");
        //p1.setMyCitizen(c1);

        c1.setPassport(p1);

        em.persist(c1);
        em.getTransaction().commit();
        System.out.println("Added Successfully.....");

        em.getTransaction().begin();
        Citizen c2 = em.find(Citizen.class,1);
        System.out.println("Citizen id = "+ c2.getId());
        System.out.println("Citizen name = "+ c2.getName());
        System.out.println("Passport No: = "+ c2.getPassport().getId());
        
        Passport p2 = em.find(Passport.class,1);
        System.out.println("Passport Id = "+p2.getId());
        System.out.println("Passport Issuer = "+p2.getIssuer());
        //System.out.println("Name of Citizen = "+p2.getMyCitizen().getName());
    }
}
