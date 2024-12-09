package arrays;
import java.util.Scanner;
import java.util.HashSet;
public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of first array");
int n1=sc.nextInt();
System.out.println("enter the second length of array");
int n2=sc.nextInt();
	int a[]=new int[n1];
	int b[]=new int[n2];
System.out.println("enter the elements of first array");
for(int i=0;i<n1;i++) {
	a[i]=sc.nextInt();
}
System.out.println("enter the elements of second array");
for(int j=0;j<n2;j++) {
	b[j]=sc.nextInt();
}
HashSet<Integer>printed=new HashSet<>();
for(int i=0;i<n1;i++) {
	for(int j=0;j<n2;j++) {
		if(a[i]==b[j] && !printed.contains(a[i])) {
			System.out.println(a[i]);
			printed.add(a[i]);
			break;
		}
	}
}

	}

}
