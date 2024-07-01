package operators;
import java.util.Scanner;
public class prbm22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age of person");
		int a=sc.nextInt();
		System.out.println("enter ' y' for indian  and 'n' for non indian");
		char c=sc.next().charAt(1);
        if(c=='y' && a>=18)
        {
        	System.out.println("eligible for vote");
        }
        else
        {
        	System.out.println("not eligible for vote");	
        }
	}

}
