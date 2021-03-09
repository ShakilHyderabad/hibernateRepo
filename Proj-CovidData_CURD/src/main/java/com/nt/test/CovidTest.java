package com.nt.test;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.CovidEntity;

public class CovidTest {

	public static void main(String[] args) {
		Transaction tx=null;
		 Session ses,ses1;
		//activate hibernate framework
		Configuration cfg=new Configuration();
	    Configuration configure = cfg.configure("com/nt/config/hibernate.cfg.xml");
	    
	   //create SesstionFactory Object
	    SessionFactory fact=cfg.buildSessionFactory(); 
	   
	    //create sesstion object
	    ses=fact.openSession();
	    ses1=fact.openSession();  
	    
	    CovidEntity entity=new CovidEntity();
	    entity.setSid(5);
	    entity.setName("MP");
	    entity.setTotalCases(70000L);
	    entity.setDeathCases(5000L);
	    entity.setActivCases(2000L);
	    entity.setReleaseCases(50000L);
	     
	  
	    
	    	CovidEntity ent=ses.get(CovidEntity.class,2);
	    	System.out.println("Record="+ent);
          	CovidEntity ent2=ses.get(CovidEntity.class,2);
          	System.out.println("Record="+ent2);
	    	
          	CovidEntity ent3=ses1.get(CovidEntity.class,2);
	    	System.out.println("Record2="+ent3);
        	
	       
	    
	    
	    
	    
	    
	    
	   
	    //saveOrUpdate
	  /*  try {
	    	 tx=ses.beginTransaction();
	    	 ses.merge(entity);
	    	 tx.commit();
	    	 System.out.println("Record");
	    }
	    catch (Exception e) {
			tx.commit();
	    	e.printStackTrace();
			
		}*/
	    
	    
	    
	    
	    
	    
	    
	     
	     
	     
	     /*//load and update in tranesaction
	     CovidEntity entit=ses.get(CovidEntity.class,3);
	     if(entit==null) {
	    	 System.out.println("Record Not Found For Updation");
	     }
	     else
	       try{
	    	 tx=ses.beginTransaction();
	         entit.setReleaseCases(2000L);
	         ses.update(entit);
	         tx.commit();
	       }
	      catch (Exception e) {
		  tx.rollback();
		  e.printStackTrace();
		}*/
	     
	     //update opeation
	   /*  //direct update
	     try {
	       tx=ses.beginTransaction();
	       ses.update(entity);
	       tx.commit();
	       System.out.println("Record updated Successfuuly");
	     
	     }
	     catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("Updation Failed");
		}*/
	     
	    /* Deletion operation
	     * try {
	    	 tx=ses.beginTransaction();
	    	 ses.delete(entity);
	    	 tx.commit();
	    	 System.out.println("record Deletd Successfully");
	     }
	     catch (Exception e) {
	        tx.rollback();
			e.printStackTrace();
			System.out.println("Deletion Failed");
		}*/
	     
	     
	     
	    /*load and delete object
	     CovidEntity ent=ses.get(CovidEntity.class,5);
	     if(ent==null) {
	    	 System.out.println("Record Not Found For Deletion");
	     }
	     else {
	    	 try {
	    		 tx=ses.beginTransaction();
	    		  ses.delete(ent);  
	    		  tx.commit();
	    		  System.out.println("Record Deleted Successfully");
	    	 }
	    	 catch (Exception e) {
			  tx.rollback();
			  e.printStackTrace();
			  System.out.println("Record Deletion Failed");
			}
	     }*/
	     
	     
	    /*select operation
	      CovidEntity ent=ses.get(CovidEntity.class,1);
	     CovidEntity ent=ses.load(CovidEntity.class,1); 
	     System.out.println("record="+ent);
	     */
	     
	     
	 /*Save Operation    
	 try {
	     tx=ses.beginTransaction();
	     //Integer sid=(Integer)ses.save(entity); 
	      //Serializable save = ses.save(entity);
	      ses.persist(entity);
	     //System.out.println("sid=");
	     tx.commit();         
	 }
	 catch (HibernateException e) {
		tx.rollback();
		e.printStackTrace();
		System.out.println("Insertion Failed");
	}*/
	     
	     
	     
		
		
		

	}

}
