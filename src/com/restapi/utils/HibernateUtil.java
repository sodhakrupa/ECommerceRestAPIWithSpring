package com.restapi.utils;

import java.net.URI;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static{
		sessionFactory = buildSessionFactory();
	}
	
	private static SessionFactory buildSessionFactory() {

		try {
			
		/*	URI dbUri = new URI(System.getenv("DATABASE_URL"));
			System.out.println("dburi: "+dbUri);
			
		    String username = dbUri.getUserInfo().split(":")[0];
		    String password = dbUri.getUserInfo().split(":")[1];
		    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

		    AnnotationConfiguration conf = new AnnotationConfiguration().configure();
		      // <!-- Database connection settings -->
		      conf.setProperty("hibernate.connection.url", dbUrl);
		      conf.setProperty("hibernate.connection.username", username);
		      conf.setProperty("hibernate.connection.password", password);
		     
			System.out.println("Building session factory");
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
					 applySettings(conf.getProperties()).build();   
			 
			 return conf.buildSessionFactory(serviceRegistry);*/

			//****************** Code For local db connection************************************//
			
			 Configuration conf = new Configuration().configure();
			 StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
			 return conf.buildSessionFactory(builder.build());
			 
		} catch (Throwable ex) {

			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;
	}
}
