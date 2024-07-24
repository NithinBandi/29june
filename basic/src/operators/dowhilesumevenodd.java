package operators;
import java.util.Scanner;
public class dowhilesumevenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter up to which number");
		int a=sc.nextInt();
		int oddsum=0;
		int evensum=0;
		int i=1;
		do {
			
			if(i%2==0)
			{
				evensum=evensum+i;
			}
			else
			{
				oddsum=oddsum+i;
			}
			
			i++;
		}while(i<=a);
		System.out.println("odd sum is:"+oddsum);
		System.out.println("even sum is:"+evensum);

	}

}
