package questions;

import java.util.Arrays;

public class lastzeroes {
	public static void main(String[] args) {
		int arr[]= {1,2,3,0,5,6,7,8,9,0};
		 int j=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]!=0)
			 {
			 int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 j++;
		 }
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
	}

}
