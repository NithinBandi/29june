package arrays;

public class maxandmin {

	public static void main(String[] args) {
		int arr[]= {3,6,2,8,5};
		
		findminmax(arr);
		

	}
	public static void findminmax(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("largest number is"+max +"smallest number is:"+min);
	}

}
