package operators;
import java.util.Scanner;
public class prbm5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("it is even number");
		}
		else
		{
			System.out.println("it is not a even number");
		}
	}

}
