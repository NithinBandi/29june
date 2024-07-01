package operators;
import java.util.Scanner;
public class prbm13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if (a==b && a==c)
		{
			System.out.println("it is a equilateral triangle");
		}
		else if (a==b || a==c)
		{
			System.out.println("it is a isolesece triangle");
		}
		else
		{
			System.out.println("it is scalene triangle");
		}

	}

}
