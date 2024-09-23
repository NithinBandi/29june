package arrays;
import java.util.Scanner;
public class palindromearr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements you want to enter");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        checkpalindrome(arr);
	}
	public static void checkpalindrome(int arr[]) {
		int start=arr[0];
		int end=arr[arr.length-1];
		if (start=end)
		{
			
		}
	}

}
