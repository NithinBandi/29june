package operators;
import java.util.Scanner;
public class ducknum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		String num=sc.nextLine();
		if (checkduck(num))
		{
			System.out.println("it is a duck number");
		}
		else
		{
			System.out.println("it is not a duck number");
		}
        
		
	}
	public static boolean checkduck(String num)
	{
		if(num.charAt(0)=='0')
		{
			return false;
		}
		
		for(int i=1;i<num.length();i++)
		{
			if(num.charAt(i)=='0')
			{
				return true;
			}
				
		}
		return false;
	}

}
