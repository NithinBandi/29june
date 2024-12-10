package oops;

public class methodoverload {
public int add(int a,int b){
	return (a+b);
	 
}
public int add(int a,int b,int c) {
	return (a+b+c);
}
public int add(int a,int b,int c,int d) {
	return (a+b+c+d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverload m=new methodoverload();
		System.out.println(m.add(2, 3));
		System.out.println(m.add(2, 4,5));
		System.out.println(m.add(3,6,5,8));
		

	}

}
