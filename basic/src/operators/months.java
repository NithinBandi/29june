/*Write a program that takes a number from 1 to 12 as input and prints the corresponding month name using a
Switch Statements*/
package operators;
import java.util.Scanner;
public class months {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case(1):
		{
			System.out.println("january");
			break;
		}
		case(2):
		{
			System.out.println("feburary");
			break;
		}
		case(3):
		{
			System.out.println("march");
			break;
		}
		case(4):
		{
			System.out.println("april");
			break;
		}
		case(5):
		{
			System.out.println("may");
			break;
		}
		case(6):
		{
			System.out.println("june");
			break;
		}
		case(7):
		{
			System.out.println("july");
			break;
		}
		case(8):
		{
			System.out.println("august");
			break;
		}
		case(9):
		{
			System.out.println("september");
			break;
		}
		case(10):
		{
			System.out.println("octobe");
			break;
		}
		case(11):
		{
			System.out.println("november");
			break;
		}
		case(12):
		{
			System.out.println("december");
		}
		}

	}

}
