package questions;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Employee_1 {
	
	private String name;
	private Double salary;
	private int code;
	public Employee_1(String name, Double salary, int code) {
		super();
		this.name = name;
		this.salary = salary;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", code=" + code + "]";
	}
	
}
class Employname implements Comparator <Employee_1>
{
	@Override
	public int compare(Employee_1 o1, Employee_1 o2) 
	{
		return o1.getName().compareTo(o2.getName());
	}
}
class empsal implements  Comparator <Employee_1>
{
	@Override
	public int compare(Employee_1 o1, Employee_1 o2)
	{
		if(o1.getSalary()>o2.getSalary())
		return 1;
		else
			return-1;
	}
}
class empcode   implements Comparator <Employee_1>
{

	@Override
	public int compare(Employee_1 o1, Employee_1 o2)
	{
		if(o1.getCode()>o2.hashCode())
		
		return 1;
		else
		
			return -1;
	}
}
class Employee_2{
	public static void main(String[] args) {
		TreeMap<Employee_1,String> l1=new TreeMap<Employee_1,String>(new Employname ());
		l1.put(new Employee_1("cat", 1.0,78), "amith");
		l1.put(new Employee_1("got", 1.0,78), "ra");
		l1.put(new Employee_1("miller", 1.0,78), "fa");
		l1.put(new Employee_1("sa", 1.0,78), "ga");
		for(Employee k:l1.entryset())
		{
			System.out.println(k);
		}
		
	}
}

	
	