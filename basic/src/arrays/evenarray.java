
/*Write a program to print even elements in a given array
 * */
package arrays;

import java.util.Scanner;
public class evenarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers");
		int a=sc.nextInt();
		int sum=0;
		System.out.println("enter"+ a +"numbers");
		int arr[]=new int[a];
		
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
			
		
		
	}

}
