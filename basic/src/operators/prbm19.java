package operators;
import java.util.Scanner;
public class prbm19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month number from (1-12)");
		int a=sc.nextInt();
		System.out.println("if it is a leap year enter 0 else 1:");
		int year=sc.nextInt();
		if(a==2)
		{
			if (year==0)
			{
				System.out.println("29 days");
			}
			else
			{
				System.out.println("it has 28 days");
			}
		}
		else if(a==1 || a==3 || a==5 ||a==7 ||a==9 || a==11 )
		{
			System.out.println("31 days");
		}

		else
		{
			System.out.println("30 days");
		}
	}

}
