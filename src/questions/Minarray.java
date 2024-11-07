package questions;

public class Minarray  {
	// TODO Auto-generated constructor stub
public static void main(String[] args) {
	int arr[]= {2,4,7,10,1,7,8,9};
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println(max);
	int min=max;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	System.out.println(min);
	int t=min;
	for(int i=arr[t];i<arr.length;i++) {
		if(arr[i]>t)
		{
			
			t=arr[i];
		}

	}
	System.out.println(t-min);
	
	
}

}
