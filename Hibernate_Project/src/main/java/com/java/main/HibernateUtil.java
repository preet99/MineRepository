package com.java.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.java.entity.Author;
import com.java.entity.Book;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;

	private static SessionFactory loadSessionFactory() {
		try {
			Configuration configration = new Configuration();
			configration.configure("hibernate.cfg.xml");
			configration.addAnnotatedClass(Author.class);
			configration.addAnnotatedClass(Book.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configration.getProperties()).build();

			sessionFactory = configration.buildSessionFactory(serviceRegistry);
			return sessionFactory;
		} catch (Throwable ex) {
			System.err.println("Error while creating sessionFactory");
			throw new ExceptionInInitializerError(ex);
		}

	}

	public static Session getSession() {
		return loadSessionFactory().openSession();

	}

}
