package string;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.*;

public class DuplicatesInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		    int s=sc.nextInt();
		    int []arr=new int[s];
		    for(int i=0;i<arr.length;i++)
		    {
		    	System.out.println("enter the number");
		    	arr[i]=sc.nextInt();
		    }
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
		    System.out.println(arr[0]);
		    System.out.println(arr[arr.length-2]);
		    
		
		

	}

}
