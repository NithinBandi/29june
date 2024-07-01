package operators;
import java.util.Scanner;
public class prbm17 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a year");
	int a=sc.nextInt();
	if(a%4==0)
	{
		System.out.println("it is a leap year");
	}
	else
	{
		System.out.println("it is not a leap year");
	}

	}

}
