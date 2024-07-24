package operators;
import java.util.Scanner;
public class neonnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a digit");
		int a=sc.nextInt();
		int k=a*a;
		int sum=0;
		while(k>0)
		{
			int r=k%10;
			sum=sum+r;
			k=k/10;
		}
		if(a==sum)
		{
			System.out.println("it is a neon number");
		}
		else
		{
			System.out.println("it is not a neon number");
		}

	}

}
