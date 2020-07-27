package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Emp;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Emp e=new Emp("yatheesha","SDE");
		  Configuration con=new Configuration().configure().addAnnotatedClass(Emp.class);
		  System.out.println(12);
		SessionFactory sf=con.buildSessionFactory();
		 System.out.println(13);
		Session s= sf.openSession();
		System.out.println(14);
		Transaction tx=s.beginTransaction();
		  System.out.println(15);
		s.save(e);
		
		System.out.println(16);
		tx.commit();
		 System.out.println(17);
		
		
		 
	       
	}

}
