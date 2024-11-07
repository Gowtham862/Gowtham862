package questions;
import java.util.*;
 class main{
	
	private int id;
	private String name;
	private long e;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getE() {
		return e;
	}
	public void setE(long e) {
		this.e = e;
	}	
	
}
class Rahul
  {
     public static void main(String[] args) 
        {
    	 main m=new main();
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the id");
    	  m.setId(sc.nextInt());
    	 System.out.println("enter the name");
    	 m.setName(sc.next());
    	 System.out.println("enter work");
    	 m.setE(sc.nextLong());
    	  
    	     
	
}
}