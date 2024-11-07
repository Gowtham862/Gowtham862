package string;
import java.util.*;
public class arraybasic {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int arr=sc.nextInt();
		int ar[]=new int[arr];
		System.out.println("enter the elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			
		
		}
	    System.out.println("the even numbers are");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
		System.out.println("the odd numbers are");
		for(int i=0;i<ar.length;i++)
		{
		if(ar[i]%2!=0) {
			System.out.println(ar[i]);
		}
		}
	}
		}
		


