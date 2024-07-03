package operators;
public class prbm27
{
	public static void main(String[] args)
	
	{
		int n=100;
		for(int i=0;i<n;i++)
		{
			if(i==4 || i==18)
			{
				continue;
			}
			System.out.println("it is printing"+i);
		}
	}
}