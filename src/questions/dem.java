package questions;

import java.util.Arrays;
import java.util.*;
class dem
{
	public static void main(String[] args)
	{
		int arr[]={12,45,67};
		int a[]=new int [arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int tem=arr[i];
			int rev=0;
			
			while(tem!=0)
			{
				int rem=tem%10;
				 rev=(rev*10)+rem;
				 tem=tem/10;
			}
			a[i]=rev;
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}		 
