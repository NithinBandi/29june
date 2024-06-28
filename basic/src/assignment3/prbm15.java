package assignment3;

public class prbm15 {

	public static void main(String[] args) {
		int a=60,b=60,c=60;
		if(a==b && a==c)
		{
			System.out.println("it is a equilateral triangle");
		}
		else if(a==b || a==c)
		{
			System.out.println("it is a isoceles triangle");
		}
		else
		{
			System.out.println("it is a scalene triangle");
		}

	}

}