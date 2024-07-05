package operators;
import java.util.Scanner;
public class sumofpositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a;
        do {
        	
        	System.out.println("enter a number");
        	a=sc.nextInt();
        	if(a >= 0)
        	{
        		sum=sum+a;
        	}
        }
        while(a>0);
        	
        	System.out.println("sum is" + sum);
	}

}
