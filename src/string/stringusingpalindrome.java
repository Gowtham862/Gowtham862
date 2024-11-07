package string;

public class stringusingpalindrome {
    public static void main(String[] args)
    {
    	String s="mamq";
    	String s2="";
    	for(int i=s.length()-1;i>=0;i--)
    		
    	{
    		s2=s2+s.charAt(i);
    	}
    	if(s.equals(s2))
    		
    	{
    		System.out.println("the given String is palindrome");
    	}
    	else
    	{
    		System.out.println("the given string is not palindrome");
    	}
    }
}
