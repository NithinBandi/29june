package assignment2;

public class prbm2 {

	public static void main(String[] args) {
		int a=100,b=20,c=30;
		int greatest=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("the greatest value is" +greatest);

	}

}