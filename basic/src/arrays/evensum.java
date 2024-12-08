package arrays;
import java.util.*;
public class evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of elements");
		int sum=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);

	}

}
