
package string;
import java.util.Arrays;




public class remove {

   public static void main(String[] args)
   {
	int arr[]= {1,3,4,56};
	int ar[]= {1,2,4,5};
	int a[]=new int[arr.length+ar.length];
	int m=0;
	for(int i=0;i<arr.length;i++)
	{
		a[m++]=arr[i];
	}
	for(int i=0;i<ar.length;i++)
	{
		a[m++]=ar[i];
	}
	
	
	int ss=0;
	int  s[ ]=new int[a.length];
	
	for(int i=0;i<a.length;i++)//1,3,4,56,,1,2,,4,5
	{
		
		int count=0;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
		    {
			count++;	      
	        }
		}
		if(count==0)
		{
			 s[ss++]=a[i];
		}
		
	}
	for(int i=0;i<ss;i++)
	{
		System.out.print(s[i]+" ");
	}
	for(int i=0;i<ss;i++)
	{
		for(int j=i+1;j<ss;j++)
		{
			if(s[i]>s[j])
			{
				int temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(s));
	
   }
}




	
