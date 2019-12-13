package com.java.main;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.entity.Author;
import com.java.entity.Book;

public class HibernateClass {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {
		org.apache.log4j.Logger.getLogger("org.hibernate.SQL").setLevel(org.apache.log4j.Level.DEBUG);
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
/*	    Author a = new Author();
		a.setName("Manne");
		List<Book> b = new ArrayList<Book>();
		Book book = new Book();
		book.setName("B3");
		session.save(book);
		b.add(book);
		a.setBooks(b);*/
		//session.save(a);
		//Author a1 =session.load(Author.class,1L );
		//Author a2 =session.load(Author.class,2L );
		//System.out.println(a1);
		// session.getTransaction().commit();
		//session.close();
		Session session2 = HibernateUtil.getSession();
		//Author a2 =session2.load(Author.class,2L );
		Book  b1 =session2.load(Book.class,1L );
		System.out.println(b1);
	    //List<Book> book1 = a1.getBooks();
	    //book1.add(book);
	//	a1.setBooks(b);
		//session.save(a1);
		
		//Query  em = session.createQuery("SELECT a FROM Author a join ", Author.class);
		
		
	//	em.getResultList();
		//
		//System.out.println(em.getResultList());
		//System.out.println(a);
		//tx.commit();

	}

}
