package strings;

public class removesplelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="!ja@va!#str+ing";
		String plainstr=str.replaceAll("[a-zA-Z0-9]","");
		String plainstr1=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plainstr);
		System.out.println(plainstr1);

	}

}
