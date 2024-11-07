package questions;
 abstract class vechile
{
   abstract void ride();
}
class bike extends vechile
{
	void ride() {
		System.out.println("you are riding a bike");
		
	}
	
}
class van extends vechile
{
	void ride() {
		System.out.println("you are riding a van");
		
	}
	
}
class mechanic
{
	void check(vechile v)
	{
		System.out.println("checking");
		v.ride();
	}
}
 
public class car {
	public static void main(String[] args) 
	{
		mechanic m1 =new mechanic();
		   van v=new van();
		   bike b=new bike();
		   m1.check(b);
		   m1.check(v);
	}
	
   
   
}
