/*Write a Java class called Person with private fields for name and age. Create a
constructor that takes in a name and age as parameters and initializes the fields.
Also, create a method called introduce that prints out a message introducing the
person with their name and age.*/

package constructors;
public class person {
private String name;
private String age;
person(String name,String age)
{
	this.name=name;
	this.age=age;
}
public String getData() 
{
	return name; 
}



	public static void main(String[] args) {
		person obj=new person("nithin","22");
		System.out.println("name value:"+obj.name);
		System.out.println("age value:"+obj.age);
		Test obj1=new Test();
		obj1.getvalues();
	}
		
	}
class Test
{
	public void getvalues()
	{
		person obj=new person("king","22");
		String age=obj.getData();
		System.out.println(obj.getData());
	}

}
