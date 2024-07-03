package operators;
public class prbm26 {
	public static void main(String[] args)
	{
	 	int start=3;
	 	int end=20;
	 	for(int i=start;i<=end;i++)
	 		{
	 			if(checkprime(i)==2)
	 			{
	 				System.out.print(i);
	 			}
	 		}
	}
	
	public static int checkPrime(int num) {
        if (num < 2) {
            return 0; 
        }

        int count = 0; 
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++; 
        }

        return count; // Return the count of divisors
    }
		
	}
	
	
	
}