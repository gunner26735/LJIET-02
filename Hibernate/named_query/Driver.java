package named_query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Driver {


    static void typedQueryExample(){
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("named"); 
        EntityManager em = ef.createEntityManager();

        em.getTransaction().begin();

        Teacher t1 = new Teacher();
        t1.setId(1);
        t1.setName("kumar");

        // em.persist(t1);
        em.getTransaction().commit();
        System.out.println("TEacher Added ........");

        TypedQuery<Teacher> teacherQuery = em.createQuery("select t from Teacher t",Teacher.class);
        List<Teacher> myTeachers = teacherQuery.getResultList();
        
        for(Teacher t:myTeachers){
            System.out.println("TEacher : "+t);
        }
    }

    static void typedStudent(){
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("named"); 
        EntityManager em = ef.createEntityManager();

        em.getTransaction().begin();

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("karan");
        s1.setAge(20);
        // em.persist(s1);
        em.getTransaction().commit();
        System.out.println("Student Added ........");

        // Query myQuery = em.createQuery("select s from Student s");
        // List<Student> myStudent = myQuery.getResultList();
        
        // for(Student t:myStudent){
        //     System.out.println("Student : "+t);
        // }

        Query myQuery = em.createNamedQuery("find_name");
        List<Student> myStudent = myQuery.getResultList();
        for(Student s:myStudent){
            System.out.println("Named Stud:"+s);
        }
    }

    public static void main(String[] args) {
        typedStudent();
    }
}
