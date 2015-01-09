package util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GerarTabelas {
	public static void main(String [] args){
		Configuration conf = new Configuration().configure();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		SchemaExport se = new SchemaExport(conf);
		se.create(true, true);
		session.getTransaction().commit();
		session.close();
	}
}
