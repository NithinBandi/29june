package operators;
import java.util.Scanner;
public class multplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the required table");
		int a=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(a+"*"+i+"="+a*i);
			i++;
		}

	}

}
