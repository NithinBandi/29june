package operators;

public class prbm29 {

	public static void main(String[] args) {
		int i;
		for(i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				if(i==28 || i==32)
				{
					continue;
				}
				System.out.println("even no is"+i);
			}
			
		}

	}

}
