package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Emp;




public class App {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		 	Emp u=new Emp("SIX", "java");
	        System.out.println(1);
	        Configuration con=new Configuration().configure().addAnnotatedClass(Emp.class);
	        System.out.println(12);
	        SessionFactory sf=con.buildSessionFactory();
	        System.out.println(13);
	        Session s=sf.openSession();
	        System.out.println(14);
	        org.hibernate.Transaction tx=s.beginTransaction();
	        System.out.println(15);
	        s.save(u);
	        u = (Emp) s.get(Emp.class, 5);
	        System.out.println(u);
	        tx.commit();
	        System.out.println(17);
		
		
		/*
		 * Emp u;
		 * 
		 * Configuration con=new
		 * Configuration().configure().addAnnotatedClass(Emp.class);
		 * System.out.println("connected"); SessionFactory sf=con.buildSessionFactory();
		 * 
		 * Session s=sf.openSession();
		 * 
		 * org.hibernate.Transaction tx=s.beginTransaction(); for(int i=0;i<10;i++) {
		 * u=new Emp(i+1,"name"+i,"tech"+i); s.save(u); System.out.println(s.save(u));
		 * 
		 * } tx.commit(); org.hibernate.Transaction tx2=s.beginTransaction(); for(int
		 * i=2;i<20;i++) { u = s.get(Emp.class, i); System.out.println(u);
		 * 
		 * }
		 * 
		 * 
		 * tx2.commit();
		 * 
		 * System.out.println("insterted");
		 */
		
		 
	       
	}

}
