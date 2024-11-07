package questions;

 class Average {
public static void main(String[] args) {
	int arr[] = {-5,10,10,90,-3,-2};//find the average of all positive numbers
	int[] ar= new int [arr.length];
	int count=0;
	System.out.println("all positive numbers");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
		{
		System.out.println(arr[i]);
		}
	
		
}
	System.out.println("all negative numbers"); 
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<0)
		{
			System.out.println(arr[i]);
		}
	}
	
}
}
