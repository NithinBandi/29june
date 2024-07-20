/*3. A library charges a fine for every book returned late. For the first 5 days the fine is 50 paise, for 6-10 days fine
is one rupee and above 10 days fine is 5 rupees. If you return the book after 30 days your membership will be
canceled. Write a program to accept the number of days the member is late to return the book and display the
fine or the appropriate message.*/
package operators;
import java.util.Scanner;
public class libraryfine {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("how many late days");
    int a=sc.nextInt();
	if(a<=5)
	{
		System.out.println("the fine will be 50 paise ");
	}
	else if(a>5 && a<=10)
	{
		System.out.println("the will be 1 rupee");
	}
	else if(a>10 && a<=30)
	{
		System.out.println("the fine will be 5 rupees");
	}
	else
	{
		System.out.println("your membership is been removed");
	}
	
	}

}
