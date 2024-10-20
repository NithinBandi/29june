package oops;
class Employeee{
	private String name;
	private int age;
	private double salary;
	
	public Employeee(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public double getsalary()
	{
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void displayInfo() {
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
		System.out.println("salary is:"+salary);
	}
	
}
class Manager extends Employeee{
	private String department;
	
	public Manager(String name,int age,double salary,String department) {
		super(name,age,salary);
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("department is:"+department);
	}
}


public class inhertianceex {

	public static void main(String[] args) {
		Employeee emp=new Employeee("nithin",21,50000);
		System.out.println("employee details:");
		emp.displayInfo();
		Manager mgr=new Manager("luffy",25,55000,"hr");
		System.out.println("manager details:");
		mgr.displayInfo();

	}

}
