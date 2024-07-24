package operators;
import java.util.Scanner;
public class coprime {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two number");
         int a=sc.nextInt();
         int b=sc.nextInt();
         for(int i=2;i<a;i++)
         {
        	 if(a%i==0)
        	 {
        		 if(b%i==0)
        		 {
        			 System.out.println("it is not a coprime");
        		 }
        		 else
        		 {
        			 System.out.println("it is a coprime");
        		 }
        	 }
        	 else
        	 {
        		 System.out.println("it is a coprime");
        	 }
         }
         

	}

}
