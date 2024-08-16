
package arrays;
import java.util.Scanner;
public class primenosarray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the how many numbers are to be entered");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
    if(isprime(a[i]))
    {
    	System.out.println("it is a prime number:"+ a[i]);
    }
	}
	System.out.println(" ");
	}
	public static boolean isprime(int num)
	{
		
		if(num<=1)
		{
			return false;
		}
		if(num==2)
		{
			return true;
		}
		if(num%2==0)
		{
			return false;
		}
		
		for(int i=3;i<num/2;i=i+2)
		{
			if(num%i==0)
			{
				return false;
			}
		}return true;
		
	
	
	
	
	}

}
