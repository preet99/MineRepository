package com.java.main;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.entity.Author;

public class HibernateClass {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {
		org.apache.log4j.Logger.getLogger("org.hibernate.SQL").setLevel(org.apache.log4j.Level.DEBUG);
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
        Author a1 =new Author();
        a1.setName("jassa");
        session.close();
        Session session2 = HibernateUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        Author a2 =new Author();
        a2.setName("Abhi");
        session2.merge(a1);
        tx1.commit();
	}

}
