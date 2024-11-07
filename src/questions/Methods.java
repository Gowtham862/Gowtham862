package questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Methods {
	ArrayList<employee> l1=new ArrayList<employee>();
  public  void save(employee e)
   {
	  
	  l1.add(e);
	  System.out.println(l1);
//	 for(employee r:l1) {
//		 if(e.getId()!=r.getId()) {
//			 l1.add(e);
//			 System.out.println(l1);
//		 }
//		 
//		 
//	 }

	
	
   }
  
   void remoe(int id1)
   {
	   for(int i=0;i<l1.size();i++) {
		   if(l1.get(i).getId()==id1) {
			   l1.remove(i);
			   System.out.println("removed");
			  System.out.println(l1.size());
			   break;
		   }
	   }
   }
  public  employee update(int id3)
   {
	  for(int i=0;i<l1.size();i++)
	  {
		  if(l1.get(i).getId()==id3)
		  {
			  return l1.get(i);
		  }
	  }
	return null;
   }
   void getalldata()
   {
	   Iterator it=l1.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
   }
   
    
}
