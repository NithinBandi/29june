package strings;

public class strspaces {

	public static void main(String[] args) {
		String str="  n i t hi   n  ";
		String str1=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str1);
		System.out.println("if you want to remove elements only before and after  string we have to use trim");
		String  str2=str.trim();
		System.out.println(str2);

	}

}
