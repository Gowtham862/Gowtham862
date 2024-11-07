package questions;
import java.util.*;
public class temp {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
		{
			arm(i);
			
		}
		
		
	}

	 static void arm(int n) {
		 int rev=0;
		 int count=nod(n);
		 int temp=n;
		 while(n>0)
		 {
			int rem=n%10;
			 rev=rev+power(count,rem);
			 n = n/10;
		 }
		if(rev==temp)
		{
			System.out.println(temp);
		}
		
	}

	  static int power(int count, int rem) {
		int rev=1;
		for(int i=1;i<=count;i++)
		{
			rev=rev*rem;
		}
		return rev;
	}

	static int nod(int n) {
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}

}
