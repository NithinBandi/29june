package assignment3;

public class prbm9 {

	public static void main(String[] args) {
		char c='/';
		if(c>='a' && c <= 'z')
		{
			System.out.println("it is a alphabet");
			
		}
		else if(c >= '0' && c<= '9')
		{
			System.out.println("it is a digit");
		}
		else
		{
			System.out.println("it is a special character");
		}

	}

}

