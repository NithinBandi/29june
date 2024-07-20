package operators;
import java.util.Scanner;
public class automorphicno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nuber");
		int a=sc.nextInt();
		int r=a%10;
		
        if(a==r*r)
        {
        	System.out.println("it is a automorphicho");
        }
        else
        {
        	System.out.println("it is not a automorphicho");
        }
	}

}
