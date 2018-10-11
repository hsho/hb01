package trans;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.impl.QueryImpl;

import beans.HR01;

@SuppressWarnings("rawtypes")
public class Generator {
	
	public void insertHR01(Session session, String dept, String name, String pdept) {
		HR01 hr01 = new HR01();
		hr01.setDept(dept);
		hr01.setName(name);
		hr01.setPdept(pdept);
		session.save(hr01);
	}
	
	public List queryHR01(Session session) {
		List list = session.createQuery("from HR01").list();
//		List list = session.createSQLQuery("select * from hr01").list();
		return list;
	}
	
	public void hr01Dao() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		QueryImpl query = (QueryImpl) session.createQuery("from HR01");
		SessionImplementor sessionImpl = ((SessionImplementor)session);
		sessionImpl.list("", null);
		session.getTransaction().commit();
	}
	
	public static void main(String[] args) {
		Generator generator = new Generator();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		
//		session.beginTransaction();
//		generator.insertHR01(session, "001", "x001", null);
//		generator.insertHR01(session, "002", "x002", null);
//		session.getTransaction().commit();

		session.beginTransaction();
		List hr01List = generator.queryHR01(session);
		for(int i = 0; i < hr01List.size(); i++) {
			HR01 hr01 = (HR01) hr01List.get(i);
			System.out.println(hr01.getDept() + "  -  " + hr01.getName() + "  -  " + hr01.getPdept());
		}
		session.getTransaction().commit();
		
		
		HibernateUtil.getSessionFactory().close();
	}
	
//	public static void main(String[] args) {
//		SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.getCurrentSession();
//		session.beginTransaction();
//		HR01 hr01 = new HR01();
//		hr01.setDept("001");
//		hr01.setName("x001");
//		hr01.setPdept(null);
//		session.save(hr01);
//		session.getTransaction().commit();
//		HibernateUtil.getSessionFactory().close();
//	}
}
