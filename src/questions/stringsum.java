package questions;

public class stringsum {
	public static void main(String[] args) {

		
		//String s="12";                             
//		String s1="12";
//		int a=0;
//		int b=0;
//		for(int i=0;i<s.length();i++)
//		{
//		     a=+a*10+s.charAt(i)-48;
//		  
//		}
//		for(int i=0;i<s1.length();i++)
//		{
//		     b=b*10+s1.charAt(i)-48;
//		    
//		  
//		}
//		  System.out.println(a+b);
//		
//		
		int a [] = {7,8,3,2};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>min)
			{
				int temp=a[i];
				min=a[i];
			}
		}
		System.out.println(min);
		}
		}


