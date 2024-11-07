package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

 
class tttt
{
	public static void main(String []args)
	{
		
     Methods m1=new Methods();
	
	Scanner sc=new Scanner (System.in);
	while(true)
	{
	System.out.println("1.save");
	System.out.println("2.delete");
	System.out.println("3.update");
	System.out.println("4.getalldata");
	System.out.println("5.exit");
     int   choice=sc.nextInt();
	switch(choice)
	{
	case 1:	
	System.out.println("enter the name");
	String name=sc.next();
   System.out.println("enter the id");
    int id=sc.nextInt();
    System.out.println("enter the phone");
    Long phone=sc.nextLong();
    employee e1= new employee(name,id,phone);
    m1.save(e1);
	 
	  
	       break;
	case 2:
	        System.out.println("enter the id want to remove");
	        int id1=sc.nextInt();
         	m1.remoe(id1);
         	break;
	case 3:
		    System.out.println("enter the id to update");
		     int id3=sc.nextInt();
	       employee e2=m1.update(id3);
	       if(e2!=null)
	       {
	       System.out.println("enter the name you want to update");
	       String name1=sc.next();
	       e2.setName(name1);
	       }
	       else
	       {
	    	   System.out.println("id not found");
	       }
	        break;
	case 4:
	       m1.getalldata();
	       break;
	case 5:System.exit(0);
	}
	}
	}
}

