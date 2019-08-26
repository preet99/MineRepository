package com.manpreet.java.HibernateCaching;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Session factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		factory.beginTransaction();
		System.out.println("Hello World!");
	}
}
