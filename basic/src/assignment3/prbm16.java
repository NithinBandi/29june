package assignment3;

public class prbm16 {

	public static void main(String[] args) {
		int amount=50000;
		int sell=40000;
		int result;
		result=sell-amount;
		if(result>0)
		{
			System.out.println("it is a profit by:" +result);
		}
		else if(result<0)
		{
			System.out.println("it is a loss by:" +result);
			
		}
		else
		{
			System.out.print("it is not a profit or loss :" +amount);
		}

	}

}