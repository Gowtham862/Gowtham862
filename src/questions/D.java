package questions;

import java.util.Arrays;

public class D {
	public static void main(String[] args) {
		String s="gOwKrY";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			{
				if(ch>='a'&&ch<='z')
				{
					System.out.print((char)(ch-32));
				}
				if(ch>='A'&&ch<='Z')
				{
					System.out.print((char)(ch+32));
				}
			}
		}
		
	}
}
