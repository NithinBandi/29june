package operators;
import java.util.Scanner;
public class prbm8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the m value");
		int m=sc.nextInt();
		if(m>0)
		{
			System.out.println("1");
		}
		else if(m<0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println("0");
		}


	}

}
