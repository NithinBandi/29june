package operators;
import java.util.Scanner;
public class armstrongnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number");
		int a=sc.nextInt();
		int sum=0;
		int rev=0;
        while(a>0)
        {
        	sum=a%10;
        	rev=rev+sum*sum*sum;
        	a=a/10;
        	
        }
        if(a==rev)
        {
        	System.out.println("it is a armstrong number");
        }
        else
        {
        	System.out.println("its not a armstrong number");
        }
	}

}
