package questions;
import java.util.*;
public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int arr=sc.nextInt();
		int size[]=new int[arr];
		System.out.println("enter the elements");
		for(int i=0;i<size.length;i++)
		{
			
			size[i]=sc.nextInt();
		}
	      //int min=size[0];

		for(int i=0;i<size.length;i++)
		{
			
			if(size[i]%2==0)
			{
				System.out.println(size[i]);
				
				
				
			}
			
			
		}
		
		}
		
		
	}
	


