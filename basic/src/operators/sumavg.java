package operators;
import java.util.Scanner;
public class sumavg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		float avg=sum/5;
		System.out.println("sum is"+sum);
		System.out.println("average is"+avg);

	}

}
