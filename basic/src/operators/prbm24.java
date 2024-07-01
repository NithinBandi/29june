/*package operators;
import java.util.Scanner;
public class prbm24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++,i++)
        {
        	sum=sum+i;
        	System.out.println(sum);
        }
        
        
	}

}
*/


package operators;
import java.util.Scanner;
public class prbm24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
        	

        	
        	     System.out.println (2*i-1);
        	     sum+=2*i-1;
        	
        	   System.out.println ("The Sum of odd Natural Number upto " +i+" terms is: " +sum);
        }
         
        
	}

}