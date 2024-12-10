package oops;

public class Student { 
	private String names;
	private int ages;
	private int rolls;
	public void displaydetails() {
		System.out.println(names);
		System.out.println(ages);
		System.out.println(rolls);
	}
	public Student(String name,int age,int roll) {
		this.names=name;
		this.ages=age;
		this.rolls=roll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("nithin",20,1023);
		s1.displaydetails();

	}
	

}
