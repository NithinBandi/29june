package strings;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 System.out.println("enter the string");
 String str=sc.nextLine();
 int n=str.length();
 char ch[]=str.toCharArray();
 for(int i=n-1;i>=0;i--) {
	 System.out.print(ch[i]);
 }
	}

}
