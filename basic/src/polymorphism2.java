class bank{
	public void withdraw() {
	System.out.println("what amount you want");
}
	}

class punjab extends bank{
	public void withdraw() {
		System.out.println("take an amount of 500");
	}
}
class axis extends bank {
	public void withdraw() {
		System.out.println("take an amount of 1000");
	}
}
class multiplication{
	public int mult(int a,int b) {
		return a*b;
	}
	public float mult(float a,float b,float c) {
		return a*b*c;
	}
	public double mult(double a,double b,double c,double d) {
		return a*b*c*d;
	}
}
public class polymorphism2 {

	public static void main(String[] args) {
		punjab b=new punjab();
		b.withdraw();
		axis a=new axis();
		a.withdraw();
		multiplication mul=new multiplication();
		System.out.println("multiplication of the values is"+mul.mult(3, 6));

	}

}
