package operators;
import java.util.Scanner;
public class prbm1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is greater:" +a);
		}
		else
		{
			System.out.println("b is greater:" +b);
		}

	}

}
