class animal{
	public void makesound() {
	System.out.println("animal makes sound");
}}
class dog extends animal {
	public void makesound() {
		System.out.println("dog barks");
	}
}
class cat extends animal {
	public void makesound() {
	System.out.println("cat meows");
}
}
class calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
}
public class polymorphism {

	public static void main(String[] args) {
		dog jermanshepard=new dog();
		jermanshepard.makesound();
		cat james=new cat();
		james.makesound();
		calculator cal=new calculator();
		System.out.println("addition of two numbers is:"+cal.add(5,13));
		System.out.println("addition of two numbers is:"+cal.add(5.5,13.6));
	}

}
