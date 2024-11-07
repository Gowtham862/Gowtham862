package questions;
import java.util.*;

public class vowels {
	public static void main(String[] args) {
		String s ="hello";
		
		for(int i=0;i<s.length();i++)
		{
			int c=0;
		    for(int j=0;j<s.length();j++)
		    {
		    	if(s.charAt(i)==s.charAt(j))
		    	{
		    		c++;
		    	}
		    }
		    if(c==0)
		    {
		    	System.out.println(s.charAt(i)+" "+c);
		    }
		     
		     
		     
			
		}
	}
}		
		

	