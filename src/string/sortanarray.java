package string;
import java.util.*;

public class sortanarray {
	public static void main(String[] args)
	{
	 int [] arr= {5,8,9,2,8,3,1,9};
	 int mid=arr.length/2;
	 int [] left=new int[mid];
	 for(int i=0;i<mid;i++)
	 {
		 left[i]=arr[i];
	 }
	 int [] right=new int[arr.length-mid];
	 for(int i=mid;i<arr.length;i++)
	 {
		 right[i-mid]=arr[i];
	 }
	 bub(left);
	 bub(right);
	 for(int i=0;i<left.length;i++)
	 {
		 arr[i]=left[i];
	 }
	 for(int i=0;i<right.length;i++)
	 {
		 arr[mid+i]=right[i];
	 }
	 System.out.println(Arrays.toString(arr));
	}
	public static void bub(int[]arr) {
	 for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]>arr[j]){
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
	 }
	}  
}
