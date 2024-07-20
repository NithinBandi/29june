/*Write a program that takes two numbers and an operator(+, -, *, /) as input and performs the corresponding
arithmetic operation using a Switch Statements.*/

package constructors;
import java.util.Scanner;
public class arthswitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter  operator");
		sc.nextLine();
		String operator=sc.nextLine();
		switch(operator)
		{
			case "+":
			{
				System.out.println("the addidtion of two numbers is" +(a+b));
				 break;
			}
			case "-":
			{
				System.out.println("the subtraction  of two numbers is" +(a-b));
				break;
			}
			case "*":
			{
				System.out.println("the multipication of two numbers is" +(a*b));
				break;
			}
			case"/":
			{
				System.out.println("the division of two numbers is" +(a/b));
				break;
			}
			default:
			{
				System.out.println("please enter a valid symbol");
			}
		}

	}

}
