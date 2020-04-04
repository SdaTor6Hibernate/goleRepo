import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
    }
}
