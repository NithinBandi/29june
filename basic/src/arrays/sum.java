package arrays;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers");
		int n=sc.nextInt();
		int sum=0;
		int[] array=new int[n];
	
		for(int i=0;i<n;i++)
		{
			 array[i]=sc.nextInt();
			 sum=sum+array[i];
		}
		
       System.out.println(sum);
	}

}
