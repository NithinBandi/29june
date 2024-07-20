package operators;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter another value");
		int b=sc.nextInt();
		System.out.println("press 1 for add ,press 2 for sub,press 3 for mult,press 4 for div");
		int c=sc.nextInt();
		switch(c)
		{
		case(1):
		{
			System.out.println("addition"+(a+b));
			break;
		}
		case(2):
		{
			System.out.println("subtraction"+(a-b));
			break;
		}
		case(3):
		{
			System.out.println("multiplication"+(a*b));
			break;
		}
		case(4):
		{
			System.out.println("division"+(a/b));
			break;
		}
		default:
		{
			System.out.println("enter a valid number");
		}
		
		
		}
	}

}
