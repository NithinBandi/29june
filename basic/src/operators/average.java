package operators;
import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers you want to get average");
		int a=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=a)
		{
			int value=sc.nextInt();
		    sum=sum+value;
		    i++;
		}
		float avg=sum/a;
        System.out.println("average is:"+avg);
	}

}
