package string;
import java.util.*;

public class contact {
	String username;
	long mobile;
	String totals;
	public contact(String username, long mobile, String totals) {
		this.username = username;
		this.mobile = mobile;
		this.totals = totals;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the username");
	String user=sc.next();
	System.out.println("enter the number");
	long mobil=sc.nextLong();
	System.out.println("enter the totals");
	String s=sc.next();
	}
	
	
	

}
