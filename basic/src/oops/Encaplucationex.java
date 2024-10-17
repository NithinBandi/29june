package oops;
class Employee{
	private String name;
	private int id;
	private int salary;
	
	public Employee(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public int getsalary()
	{
		return salary;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	
	
}






public class Encaplucationex {

	public static void main(String[] args) {
		Employee emp=new Employee("nithin",12121,50000);
	    System.out.println("name is:"+emp.getname());
	    System.out.println("id:"+emp.getid());
	    System.out.println("salary:"+emp.getsalary());
	    
	    emp.setname("nithinbandi");
	    emp.setsalary(55000);
	    System.out.println("name"+emp.getname());
	    System.out.println("id"+emp.getid());
	    System.out.println("salary"+emp.getsalary());
	}

}
