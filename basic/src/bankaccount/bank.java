package bankaccount;
import java.util.Scanner;
public class bank {
	
	static double balance=1000;
	  public static void deposit(double money)
			{
				balance=balance+money;
				System.out.println("balance money is:" +balance);
				
			}
			public static void withdraw(double money)
			{
				if((balance-money)>0) 
				{
					balance=balance-money;
					System.out.println("remaining balance is:" +balance);
				}
				else
				{
					System.out.println("requested amount can not dispatch");
				}
			}
			

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter account number");
		long accountno=sc.nextLong();
		System.out.println("details are:");
		System.out.println(name);
		System.out.println(age);
		System.out.println(accountno);
		System.out.println("enter a deposit/withdraw money");
		
        double money = sc.nextDouble();
        System.out.println("enter 0 for deposit and 1 for withdraw");
	  
		
		int operation=sc.nextInt();
		switch(operation)
		{
			case 0:
				deposit(money);
				break;
			case 1:
				withdraw(money);
				break;
			default:
				System.out.println("enter a valid number");
		}
		
		sc.close();
			
	}

}
