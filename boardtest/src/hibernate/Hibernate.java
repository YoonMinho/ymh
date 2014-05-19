package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
	//Hibernate.xml 위치
	private final static String RESOURCE = "hibernate/hibernate.xml";
	private static SessionFactory sessionFactory = null;
	//Hibernate 세션팩토리를 얻는 메소드
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				sessionFactory = new Configuration().configure(RESOURCE).buildSessionFactory();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;		
	}
	
}
