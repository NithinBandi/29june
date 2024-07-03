package operators;

public class fibnocci {

	public static void main(String[] args) {
		int a=0,b=1,temp=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<10;i++)
		{
			temp=a+b;
			a=b;
			b=temp;
			System.out.println(temp);
		}

	}

}
