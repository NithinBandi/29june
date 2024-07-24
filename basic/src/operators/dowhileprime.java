package operators;
import java.util.Scanner;
public class dowhileprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int i=1;
		int count=0;
		do {
			if(a%i==0)
			{
				count++;
			}
			i++;
		}while(i<a);
       if(count==1)
       {
    	   System.out.println("it is a prime number");
       }
       else
       {
    	   System.out.println("it is not a prime number");
       }
	}

}
