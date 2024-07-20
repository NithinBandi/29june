package operators;
import java.util.Scanner;
public class oddsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many times");
        int a=sc.nextInt();
        int count=0;
        for(int i=1;count<a;i++) {
        	if(i%2!=0)
        	{
        	System.out.println(i);
        	count++;
        	}
        }
        
	}

}
