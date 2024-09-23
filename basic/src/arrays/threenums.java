package arrays;
import java.util.Scanner;
public class threenums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=a+b+c;
		System.out.println("sum of the three numbers:"+sum);
         
		int lar=0;
		if(a>b && a>c)
		{
			lar=a;
		}
		if(b>a && b>c)
		{
			lar=b;
		}
		if(c>a && c>b)
		{
			lar=c;
		}
		System.out.println("largest num is:"+lar);
	    int factorial=1;
		for(int i=1;i<=lar;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of a "+lar+" is:"+factorial);
		if(lar%2==0)
		{
			System.out.println("its an even number");
		}
		else
		{
			System.out.println("its an odd number");
			
		}
		int count=0;
		for(int i=2;i<lar;i++)
		{
			if(lar%i==0)
			{
				count++;
			}
		}
		if(count==0) {
			System.out.println("its a prime number");
		}
		else
		{
			System.out.println("its not a prime");
		}
		
	}

}
