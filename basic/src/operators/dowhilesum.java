package operators;
import java.util.Scanner;
public class dowhilesum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int sum=0;
		int i=1;
		do {
			sum=sum+i;
			i++;
			
		}while(i<=a);
      System.out.println(i);
	}

}
