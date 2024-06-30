package operators;
import java.util.Scanner; 
public class prbm3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("number is positive");
		}
		else if(a<0){
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("the value is zero");
		}

	}

}
