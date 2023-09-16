package onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class PhoneDriver {

    static void setValues(){
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("Persistence");
        EntityManager em = ef.createEntityManager();

        em.getTransaction().begin();

        PhoneUser myUser = new PhoneUser();
        myUser.setUname("abc");
        myUser.setUaddress("noida");
        myUser.setUid(1);

        Phone p1 = new Phone();
        p1.setPhone_no(345345234);
        p1.setPhone_type("Apple");
        p1.setUser_id(1);

        Phone p2 = new Phone();
        p2.setPhone_no(88245323);
        p2.setPhone_type("Motorola");
        p2.setUser_id(1);

        Phone p3 = new Phone();
        p3.setPhone_no(838747834);
        p3.setPhone_type("Lenovo");
        p3.setUser_id(1);

        List<Phone> phoneList = new ArrayList<Phone>();
        phoneList.add(p1);
        phoneList.add(p2);
        phoneList.add(p3);

        myUser.setPhones(phoneList);

        em.persist(myUser);
        em.getTransaction().commit();
    }

    static void showValues(){
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("Persistence");
        EntityManager em = ef.createEntityManager();

        em.getTransaction().begin();

        PhoneUser user = new PhoneUser();
        user = em.find(PhoneUser.class, 1);
        System.out.println("User ID : "+user.getUid());
        System.out.println("User Name : "+user.getUname());
        System.out.println("User Address : "+user.getUaddress());
        List<Phone> myPhones = user.getPhones();
        myPhones.forEach((n)->System.out.println(n.phone_no));
    }

    public static void main(String[] args) {
        showValues();
    }
}
