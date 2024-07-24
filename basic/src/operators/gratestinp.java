package operators;
import java.util.Scanner;
public class gratestinp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int greatest=0;
		do {
			
			System.out.println("enter the value");
			int a=sc.nextInt();
			System.out.println("enter yes for continue and no for stop");
			sc.nextLine();
			s=sc.nextLine();
			if(a>greatest)
			{
				greatest=a;
			}
		}
		while (s.equals("yes"));
        System.out.println(greatest);
	}

}
