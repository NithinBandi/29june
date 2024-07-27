/*Write a Java class called Person with private fields for name and age. Create a
constructor that takes in a name and age as parameters and initializes the fields.
Also, create a method called introduce that prints out a message introducing the
person with their name and age*/

package constructors;
import java.util.Scanner;
public class persondetls {
    private int age;
    private String name;
	public persondetls(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public void introduce()
	{
		System.out.println("name"+name+"age"+age);
		
	}
	 
	
	public static void main(String[] args) {
		persondetls person1=new persondetls("king",22);
		person1.introduce();
		persondetls person2=new persondetls("love",20);
		person2.introduce();
		

	}

}
