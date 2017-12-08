package serverPackage;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	private static SessionFactory sessionFactory = null;
	private static SessionFactory configureSessionFactory() throws HibernateException
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}
	public static void main(String[] args) 
	{
		configureSessionFactory();
		Session session = null;
		Transaction tx = null;
		
		//hier kommen die Befehle für Hibernate rein
		try 
		{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Player player = new Player();
			Map map = new Map();
			GameHistory history = new GameHistory();
			session.save(player);
			session.save(map);
			session.save(history);
			session.flush();
			tx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			tx.rollback();
		}
		finally 
		{
			if(session != null)
			{
				session.close();
			}
		}
	}
}
