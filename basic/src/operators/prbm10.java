package operators;
import java.util.Scanner;
public class prbm10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cost price and selling price");
		int cp=sc.nextInt();
		int sp=sc.nextInt();
		if(cp-sp>0)
		{
			int k=cp-sp;
			System.out.println("it is a loss with:"+k);
		}
		if(cp-sp<0)
		{
			int k=sp-cp;
			System.out.println("it is a profit with:"+k);
		}
		
	}

}
