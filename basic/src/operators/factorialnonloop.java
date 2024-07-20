package operators;
import java.util.Scanner;
public class factorialnonloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int r=1;
		for(int i=1;i<=a;i++)
		{
			r=r*i;
		}
		System.out.println(r);
		
	
	}

}
