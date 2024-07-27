/*Write a Java class called Student with private fields for name, age, and GPA.
Create two constructors - one that takes in a name, age, and GPA as parameters and
initializes the fields, and another that takes in just a name and age as parameters
and sets the GPA to 0.0. Also, create a method called displayGPA that prints out the
student's GPA.*/
package constructors;

import java.util.Scanner;

public class student {
    private String name;
    private int age;
    private int gpa;
	public  student(String name,int age,int gpa)
	{
		this.name=name;
		this.age=age;
		this.gpa=gpa;
	}
	public  student(String name,int age)
	{
		this.name=name;
		this.age=age;
		this.gpa=0;
	}
	public void display()
	{
		System.out.println("the student gpa is"+gpa);
	}
	
    public static void main(String[] args) {
      student s1=new student("nithin",22,9);
      student s2=new student("pavan",22);
      s1.display();
      s2.display();

	}

}
