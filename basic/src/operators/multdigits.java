package operators;
import java.util.Scanner;
public class multdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
        int a=sc.nextInt();
        int k=1;
        while(a>0) 
        {   
        	int r=a%10;
        	k=k*r;
        	a=a/10;
        	
        }
        System.out.println(k);
	}

}
