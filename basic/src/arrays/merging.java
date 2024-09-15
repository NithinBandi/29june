package arrays;
import java.util.Scanner;
public class merging {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers you want to enter for the first array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();	
        }
        System.out.println("enter how many numbers you want to enter for the second array");
		int k=sc.nextInt();
		int b[]=new int[k];
		
        for(int i=0;i<k;i++)
        {
        b[i]=sc.nextInt();	
        }
        System.out.println("the merged array is");
        
		
		int p[]=new int[n+k];
		
        for(int i=0;i<n;i++)
        {
        p[i]=a[i];	
        }
        for(int i=0;i<k;i++)
        {
        	p[n+i]=b[i];
        			
        }
        for(int i=0;i<p.length;i++)
        {
        	System.out.println(p[i]);
        }
	}
	

}
