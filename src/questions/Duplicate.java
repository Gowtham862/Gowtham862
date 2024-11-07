package questions;

import java.util.Arrays;

public class Duplicate {
	public static void main(String[] args) {
		int arr[]= {1,3,4,4,4};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{ 
		        if(arr[i]>arr[j]) 
		        {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp; 
		        }	
			}
		}	
		System.out.println(Arrays.toString(arr));
		if(arr.length>1)
		{			
			for(int b=0;b<arr.length;b++) 
			{
				if(arr[arr.length-1]==arr[b]) 
				{
					System.out.println(arr[--b]);
					break;
				}
			}	
		}else {
			System.out.println(arr.length==0?"Bye" :arr[0]);
		}
	}
}