package demo.hibernate;

import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application {

    public static void main(String[] args) throws SQLException {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        Customer cust = new Customer();
        cust.setFirstName("ABC");
        cust.setLastName("XYZ");
        session.save(cust);
        tx.commit();

        session.close();
        HibernateUtil.shutdown();

    }
}
