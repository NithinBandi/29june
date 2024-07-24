package operators;
import java.util.Scanner;
public class buzznum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	int r=a%7;
	int k=a%10;
	if(r==0 || k==7)
	{
		System.out.println("it is a buzz number");
	}
	else
	{
		System.out.println("it is not a buzz world");
	}
	

	
	
	

	}

}
