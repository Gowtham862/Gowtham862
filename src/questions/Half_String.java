package questions;

public class Half_String {
	public static void main(String[] args) {
		String s="helo";
//		for(int i=0;i<s.length()/2;i++)
//		{	
//			System.out.print(s.charAt(i));
//		}
//		
		System.out.println("");
		for(int i=2;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
	     }
		System.out.println();
		 for (int i=s.length()/2-1;i >= 0; i--) 
		{
            System.out.print(s.charAt(i));

		}
	
	}

	}
