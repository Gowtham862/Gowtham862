package string;

public class dnonnumber {
	public static void main(String[] args)
	{
//		int n=90,rev=0;
//		int f=n*n;
//		while(f!=0)
//		{
//		int rem=f%10;
//		rev=rem+rev;
//		f=f/10;
//		}
//		//System.out.println(rev);
//		if(rev==n)
//		{
//			System.out.println("number");
//		}
//			else
//			{
//				System.out.println("not a number");
//		}
		int n=222;
		int count=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem>=2&&rem<=9)
			{
				count++;
			}n=n/10;}
			if(count==0)
			{
				System.out.println("its a binary");
			}
				else
				{
					System.out.println("its not a");
			}
					
		}
		
	}


