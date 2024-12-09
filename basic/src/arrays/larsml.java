package arrays;
import java.util.Scanner;
public class larsml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("enter a number");
           int n=sc.nextInt();
           int a[]=new int[n];
          
           for(int i=0;i<n;i++) {
        	   a[i]=sc.nextInt();
           }
           int small=a[0];
           int large=a[0];
           for(int i=0;i<n;i++) {
        	   if(small>a[i]) {
        		   small=a[i];
        	   }
        	   
        	   if(large<a[i]) {
        		   large=a[i];
        	   }
           }
           System.out.println("large number is:"+large);
           System.out.println("smallest number is"+small);
           
	}

}
