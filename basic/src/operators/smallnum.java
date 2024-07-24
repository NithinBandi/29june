package operators;
import java.util.Scanner;
public class smallnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int small=100000000;
		String s;
		do {
		System.out.println("enter a number");
		int a=sc.nextInt();
		
		if(a<small)
		{
			small=a;
		}
		
		System.out.println("enter yes for continue and no for stop");
		sc.nextLine();
		s=sc.nextLine();
		}while(s.equals("yes"));
	System.out.println("small number is"+small);
	}

}
