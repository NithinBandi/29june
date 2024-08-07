package arrays;
import java.util.Scanner;
public class noevenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		int[] a=new int[n];
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
System.out.println("even count is"+evencount);
System.out.println("odd count is"+oddcount);
	}

}
