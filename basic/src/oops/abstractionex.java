package oops;
abstract class shape{
	abstract double calculatearea();
	public void display() {
		System.out.println("the area is");
	}
	
}
class circle extends shape{
	private double radius;
	public circle(double radius) {
		this.radius=radius;
	}
	double calculatearea() {
		return Math.PI*radius*radius;
	}
	public void display(){
		System.out.println("circle");
	}

}

class rectangle extends shape{
	private double length;
	private double breadth;
	public  rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	double calculatearea() {
		return length*breadth;
	}
	public void display(){
		System.out.println("rectangle");
	}

}
public  class abstractionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape circle=new circle(5);
		shape rectangle=new rectangle(5,10);
		
		circle.display();
		System.out.println(circle.calculatearea());
		rectangle.display();
		System.out.println(rectangle.calculatearea());

	}

}
