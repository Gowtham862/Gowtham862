package questions;
import java.util.*;

public class demo {
public static void main(String[] args) 
{
int ar[]= {1,2,3,7,89,7};
for(int i=0;i<ar.length;i++)
{
	int count=0;
	for(int j=i+1;j<ar.length;j++)
	{
		if(ar[i]==ar[j])
		{
			count++;
		}
	}
	if(count==0)
	{
		System.out.println(ar[i]);//1,2.3.89.7
	}
}


}
}
		
