package string;
interface movies
{
	void oldmovies();
	void  mmovies();
}
class netflix implements movies
{
	public void oldmovies() 
	{
		System.out.println("the recent available in netflix");
	}
	public void mmovies()
	{
		System.out.println("rayaan");
	}
}
class prime implements movies
{
	
	public void oldmovies()
	{
		System.out.println("the new movies available in prime");
	}
	public void mmovies()
	{
		System.out.println("demontycolony");
	}
}
 public class gowtham
{
	public static void main(String[] args)
	{
		  movies m1=new prime();
		  m1.oldmovies();
		  m1.mmovies();
	}
}