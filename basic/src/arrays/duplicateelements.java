package arrays;
import java.util.Scanner;
public class duplicateelements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=n;j>0;j--)
        	{
        		if(a[i]==a[j])
        		{
        			System.out.println("the number is a duplicate" +a[i]);
        		}
        	}
        }
        
        
        
	}

}
