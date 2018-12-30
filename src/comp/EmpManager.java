package comp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.*;
import java.io.*;

public class EmpManager {



public void list()
{
  SessionFactory sf=null;
  Session session=null;
  Emp e=null;
  sf=util.HibernateUtil.getSessionFactory();
  session=sf.openSession();
  List l1= session.createQuery("from Emp").list();
  for( int i=0;i<l1.size();i++)
  {
	  e=(Emp)l1.get(i);
     System.out.println(e.getEmpno()+" "+e.getLocadd());
   }
  session.close();
  }

public void insert(int id,String fname,String lname,int sal,int ssnno,String area,String street)
{
  SessionFactory sf=null;
  Session session=null;
  Transaction tr=null;

  try{
  sf=util.HibernateUtil.getSessionFactory();
  session=sf.openSession();
  tr=session.beginTransaction();
  Emp e=new Emp();
  e.setEmpno(id);
  Name n=new Name();
  n.setFname(fname);
  n.setLname(lname);
  e.setEname(n);
  e.setSal(sal);
  Address a=new Address();
  a.setArea(area);
  a.setStreet(street);
  e.setLocadd(a);
  session.saveOrUpdate(e); //select is performed before update 
  System.out.println("----------after save");
  tr.commit();  
  System.out.println("----------after commit");
 }
 catch(Exception e){tr.rollback();}
 finally{
	 session.close();
 }

}
}
