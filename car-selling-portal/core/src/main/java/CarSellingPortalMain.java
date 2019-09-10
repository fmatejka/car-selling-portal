import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CarSellingPortalMain {

	public static void main(String[] args) {

		
		System.out.println("hello world\n");
		Car c = new Car();
		c.setId(1);
		c.setLocation("Negotin");
		c.setFirst_registration("11.01.2018");
		System.out.println(c.toString());
		
		Configuration con = new Configuration();
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		session.save(c);
	}

}
