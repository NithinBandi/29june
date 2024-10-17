package arrays;
import java.util.Scanner;
public class missinnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int []a= {1,2,4,5,6};
        int n=6;
        int missing;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
        	 sum=sum+a[i];
        }
		int orgsum=n*(n+1)/2;
		missing=orgsum-sum;
		System.out.println("the missing number is:"+missing);
		
	}
	

}
