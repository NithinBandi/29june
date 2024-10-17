/*
 *  Define a class Car with attributes make, model, and year. 
 *  Include a method displayInfo to print the car's details.
 */
package oops;

public class Car {
    
	private String make;
	private String model;
	private int year;
	
	public Car(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	public void displayInfo()
	{
		System.out.println("make of car:"+this.make);
		System.out.println("mode of car:"+this.model);
		System.out.println("year of car:"+this.year);
	}
	
	public static void main(String[] args) {
		Car c=new Car("toyota","2020",2);
		c.displayInfo();
		
	}

}
