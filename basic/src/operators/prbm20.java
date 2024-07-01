package operators;
import java.util.Scanner;
public class prbm20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the percentage of the the student");
		float a=sc.nextFloat();
		if(a>=91 && a<=100)
		{
			System.out.println("A");
		}
		else if(a>=81 && a<=90)
		{
			System.out.println("B");
		}
		else if(a>=71 && a<=80)
		{
			System.out.println("C");
		}
		else if(a>=61 && a<=70)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("f");
		}
		
		

	}

}
