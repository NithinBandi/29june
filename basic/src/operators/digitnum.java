/*
 * Write a Java program that reads a positive integer and counts the number of digits.
 */
package operators;
import java.util.Scanner;
public class digitnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit");
		int a=sc.nextInt();
		int count=0;
		
		if(a<=0)
		{
			System.out.println("please enter a positive number");
			
		}
		else
		{
			while(a!=0) {
				a=a/10;
			    count++;
				
			}
				
			System.out.println("the value is"+count);
		}
			
		

	}

}
