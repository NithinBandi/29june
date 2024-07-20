/*44. In a company, worker efficiency is determined on the basis of the time required for a worker to complete a
particular job. If the time taken by the worker is between 2 – 3 hours, then the worker is said to be highly
efficient. If the time required by the worker is between 3 – 4 hours, then the worker is ordered to improve
speed. If the time taken is between 4 – 5 hours, the worker is given training to improve his speed, and if the
time taken by the worker is more than 5 hours, then the worker has to leave the company. If the time taken by
the worker is input through the keyboard, find the efficiency of the worker
*/
package operators;
import java.util.Scanner;
public class workerefficiency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time taken by worker");
		int a=sc.nextInt();
		if(a>=2 && a<3)
		{
			System.out.println("worker is highly capable");
		}
		else if(a>=3 && a<4)
		{
			System.out.println("worker is needed to be improved");
			
		}
		else if(a>=4 && a<5)
		{
			System.out.println("worker needed to be trianed");
		}
		else
		{
			System.out.println("worker is no longer needed");
		}
		

	}

}
