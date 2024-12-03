package miscellenous;

public class sorting {

	public static void main(String[] args) {
	sort(5);

	}
	public static void sort(int n) {
		int s=0;
		int l=n;
		
		for(int i=0;i<=n/2;i++) {
			
			System.out.println(s);
			if(s!=l) {
			System.out.println(l);
			}
			s++;
			l--;
		
		}
		
	}

}
