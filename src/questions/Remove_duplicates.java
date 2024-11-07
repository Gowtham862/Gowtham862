package questions;

import java.util.Arrays;

public class Remove_duplicates {
	public static void main(String[] args) 
	{	
		int arr[] = {1,-1,-1,6,7,8,9,8};
		int size=0;
		int brr[] = new int[10];
		int n = arr.length;
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
		System.out.println("");
		System.out.print(arr[arr.length-2]);
		
		
		
		
		//System.out.println(n);
		//System.out.println(Arrays.toString(arr));
        //duplicateElement(arr, n);
	}
}
	
	//	public static void duplicateElement(int arr[], int n) {
//		for (int i = 0; i < n; i++) 
//		{
//		   for (int j = i+1;j<n;j++) 
//		    {
//	        	if (arr[i]==arr[j] && +arr[i]!=0)
//		           {
//		           arr[j]=0;
//		          }
//	        	
//		    }
//		   
//	        	 if(arr[i]!=0) 
//		           {
//		              System.out.print(arr[i]+" ");
//	               	}
//		    
//		}
//		   
//		}

		

