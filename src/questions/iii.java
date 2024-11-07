package questions;

import java.util.Arrays;

class iii{
	public static void main(String[] args)
	{
		String s="ssderdess";
		String finalres ="";
		

      for(int i=0;i<s.length();i++) {
    	  int c=0;
	           for(int j=0;j<s.length();j++) {
	        	   if(i!=j) {
	        	   if(s.charAt(i)==s.charAt(j)) {
	        		   c++;
	        		   break;
	        	   }
	        	   }
	           }
	          if(c==0) {
	        	  System.out.println(s.charAt(i));
	          }
       }
	
	}
}
