package operators;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int sum=0;
		while(a>0)
		{
			int r=a%10;
			sum=r+sum*10;
			a=a/10;
		}
		System.out.println(sum);

	}

}
