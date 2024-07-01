package operators;
import java.util.Scanner;
public class prbm14 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the three numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>b && a>c)
	{
		System.out.println("a is the largest number" +a);
	}
	else if(b>c && b>a)
	{
		System.out.println("b is the largest number" +b);
	}
	else 
	{
		System.out.println("c is the largest number" +c);
	}

	}

}
