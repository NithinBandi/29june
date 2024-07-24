package operators;
import java.util.Scanner;
public class Perfectnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
			sum=sum+i;	
			}
		}
		if(sum==a)
		{
			System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}
		

	}

}
