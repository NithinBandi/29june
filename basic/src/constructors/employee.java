/*Write a Java class called Employee that extends Person and adds a private field for
salary. Create a constructor that takes in a name, age, and salary as parameters and
initializes the fields using the super keyword to call the Person constructor. Also,
create a method called displaySalary that prints out the employee's salary.*/
package constructors;
import java.util.Scanner;
 
class persone{
	private int age;
	private String name;
	public persone(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
}

public class employee extends persone{
	
	private double salary;
	public employee(String name,int age,int salary) {
		super(name,age);
		this.salary=salary;
	}
    public void dispsalary()
    {
    	System.out.println("salary:"+salary);
    }
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee emp=new employee("nithin",22,200000);
		emp.dispsalary();

	}

}
