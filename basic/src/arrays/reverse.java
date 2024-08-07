package arrays;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers to be entered");
		int n=sc.nextInt();
		System.out.println("enter the numbers");
		int[] a=new int[n];
		int i=0;
		int j=n-1;
		int temp;
		for(int k=0;k<n;k++)
		{
			a[k]=sc.nextInt();
			
		}
		System.out.println("printing the original elements");
		for(int k=0;k<n;k++)
		{
			
		    System.out.println(a[k]);	
		}
		
		while(i<j)
		{
			
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
			
		}
		System.out.println("reverse numbers are");
		for(int k=0;k<n;k++)
		{
		
			System.out.println(a[k]);
		}
	}

}
