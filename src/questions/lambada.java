package questions;
interface A
{
	void gow();
	
}

public class lambada {
	
	public static void main(String[] args)
	{
		A o=()->System.out.println("hello");
		o.gow();
		
}
}
