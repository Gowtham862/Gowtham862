package string;

public class palin {
	public static void main(String[] args) {
		int arr[]= {202,304,607};
		for(int i=0;i<arr.length;i++)
		{
			int j=arr[i];
			if(palindrome(j)){
				System.out.println("it is palin");
				
			}
			else{
				System.out.println("It is not a plaindrome");
			}
			
		}
	}


	private static boolean palindrome(int j) {
	   int rev=0; 
	   int palin=j;
	   while(j>0)
	   {
	   int rem=j%10;
	   rev=rev*10+rem;
	   j=j/10;
		
	}
	   return palin==rev;

}
}
