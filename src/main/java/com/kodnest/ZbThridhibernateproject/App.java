package com.kodnest.ZbThridhibernateproject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Scanner sc = new Scanner(System.in);
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction tran = session.beginTransaction();
        
        Student ref = session.get(Student.class, sc.nextInt());
        if(ref != null) {
        	session.delete(ref);
        	System.out.println("Student deleted successfully");
        } else {
        	System.out.println("Student data not found");
        }
        
        tran.commit();
        session.close();
        factory.close();
        
        
        
    }
}
