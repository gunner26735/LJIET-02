package onetomany_bidirection;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpDriver {
    public static void main(String[] args) {
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("Persistence");
        EntityManager em = ef.createEntityManager();

        em.getTransaction().begin();
        
        Department d1 = new Department();
        d1.setDname("IT");

        Employee e1 = new Employee();
        e1.setEname("xyz");
        e1.setEemail("s@gasd.com");
        e1.setMyDepartment(d1);

        Employee e2 = new Employee();
        e2.setEname("pqr");
        e2.setEemail("rew@gmail.com");
        e2.setMyDepartment(d1);

        Employee e3 = new Employee();
        e3.setEname("olm");
        e3.setEemail("io@gmail.com");
        e3.setMyDepartment(d1);

        Set<Employee> empSet = new HashSet<Employee>();
        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);

        d1.setEmpSet(empSet);

        em.persist(d1);
        em.getTransaction().commit();
    }
}
