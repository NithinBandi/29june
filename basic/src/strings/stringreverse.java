package strings;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		String str="Ayyappa";
		int n=str.length();
		System.out.println("first method");
		char ch[]=str.toCharArray();
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println("");
		System.out.println("second method");
		for(int i=n-1;i>=0;i--) 
		{
			System.out.print(str.charAt(i));
		}
        System.out.println("");
		System.out.println("i am reversing string using string buffer");
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		System.out.println("i am reversing using string builder");
		StringBuilder sr=new StringBuilder(str);
		System.out.print(sr.reverse());
		
		
		
		 }
	

}
