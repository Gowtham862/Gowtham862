package string;
import java.util.*;


public class ggi {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int low=sc.nextInt();
		System.out.println("enter the number");
		int hig=sc.nextInt();
		for(int i=low;i<=hig;i++)
		{
			arm(i);
		}	
				
	}
	static void arm(int n)
	{   int rev=0,temp=n;
	while(n>0)
	{
	
		int rem= n%10;
		rev=rev*10+rem;
		 n=n/10;
	}
	if(rev==temp)
	{
		System.out.println(temp);
	}
		
	}
	
}
