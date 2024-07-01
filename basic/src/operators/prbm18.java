package operators;
import java.util.Scanner;
public class prbm18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter telugu hindi and math marks");
		int tel=sc.nextInt();
		int hin=sc.nextInt();
		int mat=sc.nextInt();
		float avg=(tel+hin+mat)/3;
		System.out.println("the avg is:" +avg);
        if(avg>=91 && avg<=100)
        {
        	System.out.println("Grade :A");
        }
        else if(avg>=81 && avg<=90)
        {
        	System.out.println("Grade :B");
        }
        else if(avg>=71 && avg<=80)
        {
        	System.out.println("Grade :B");
        }
        else if(avg>=61 && avg<=70)
        {
        	System.out.println("Grade :c");
        }
        else if(avg>=51 && avg<=60)
        {
        	System.out.println("Grade :D");
        }
        else
        {
        	System.out.println("Grade :f");
        }
        
	}

}
