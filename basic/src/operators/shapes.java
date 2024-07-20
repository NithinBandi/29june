package operators;
import java.util.Scanner;
public class shapes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of sides");
		int a=sc.nextInt();
		switch(a)
		{
		case (3):
		{
			System.out.println("its a triangle");
			break;
		}
		case (4):
		{
			System.out.println("its a square or rohmbus");
			break;
		}
		case (5):
		{
			System.out.println("its a pentagon");
			break;
		}
		case (6):
		{
			System.out.println("its a hexagon");
			break;
		}
		
		case (7):
		{
			System.out.println("its a septagon");
			break;
		}
		case (8):
		{
			System.out.println("its a octagon");
			break;
		}
		case (9):
		{
			System.out.println("its a nanogon");
			break;
		}
		default:
		{
			System.out.println("enter a valid number");
		}
		
		
		
		}

	}

}
