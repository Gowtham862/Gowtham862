package questions;
public class reverse_pyramid {
		public static void main(String[] args) {
	     int n=9;
	     for(int i=1;i<=n;i++)
	     {  
	         for(int j=1;j<=n;j++)
	         {
	            if((i<=n-4 && i+j>=n-3 && j-i<=n-5) || (i>5 && i-j<=4 && i+j<=n+5))
	          System.out.print("*");
	            else
	               System.out.print(" ");
	     }
	    
	       System.out.println();
		       
	  }    
		}
	}




