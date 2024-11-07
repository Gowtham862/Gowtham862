package questions;

import java.util.Arrays;

public class ben {
	public static void main(String[] args) {
		int arr[]= {5,6,6,7,8,9,8};
		int size=0;
		int brr[]=new int[10];
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			if(c==0)
			{
				brr[size]=arr[i];
				  size++;
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(brr[i]+" ");
		}
		System.out.println();
	System.out.print("******************************************");
	System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+"  ");
			
		}
		System.out.println();
		System.out.println("first minimum value"+arr[0]);
		System.out.println("first maximum value"+arr[arr.length-2]);
		
		
	}
	
}