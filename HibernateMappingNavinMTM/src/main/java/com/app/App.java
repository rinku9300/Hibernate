package com.app;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Laptop lap=new Laptop();
        lap.setlId(101);
        lap.setlName("Dell");
        
        Student stud=new Student();
        stud.setRollNo(1234);
        stud.setName("Arun");
        stud.setMarks(56);
        stud.getLaptop().add(lap);
        
        System.out.println("Hello");
             
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(lap);
        session.save(stud);
       
        
        tx.commit();
        session.close();
        
    }
}
