package operators;
import java.util.Scanner;
public class factorsofnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int i=1;
        do {
        
        if(a%i==0)
        {
        	System.out.println(i);
        	
        }i++;
        }while(i<=a);
	}

}
