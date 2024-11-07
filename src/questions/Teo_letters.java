package questions;

public class Teo_letters {
	public static void main(String[] args)
	{
		String s="this";
		//for(int i=s.length()-1;i>=0;i--)
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(s.charAt(i));
			}
		}
	}

}
