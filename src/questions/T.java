package questions;

public class T {
	public static void main(String[] args) {
		int arr[]= {10,6,5,1,4,3,9};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		int t=min;
		//int k=0;
		for(int i=arr[t];i<arr.length;i++)
		{
			if(arr[i]>t)
			{
				t=arr[i];
			}
		}
		System.out.println(t);
	}

}
