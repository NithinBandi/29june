package arrays;

public class dupliarr {

	public static void main(String[] args) {
		int arr[]=new int[] {2,3,5,2,3,6,3,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}

	}

}
