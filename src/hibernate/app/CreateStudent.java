/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.app;

import hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Crazian
 */
public class CreateStudent {

    public static void main(String[] args) {
        
        //create the session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //create session
        Session session = factory.getCurrentSession();
        
        try{       
            // creating the student object
            System.out.println("Creating student object...");
            Student tempStudent = new Student("Jack", "Nimble", "run@bequick.com");

            // start a transaction
            session.beginTransaction();
            
            // save the object
            System.out.println("Saving...");
            session.save(tempStudent);
            
            // commit
            session.getTransaction().commit();
            
            System.out.println("Saving Complete");
            
        }
        finally {
            factory.close();
        }
        
    }

}
