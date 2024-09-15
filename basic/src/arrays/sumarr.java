package arrays;

public class sumarr {

	public static void main(String[] args) {
		int arr[]= {2,5,1,7};
		System.out.println("sum is" +sum(arr));
	}
	public static int sum(int[] arr)
	{
		int add=0;
		for(int i=0;i<arr.length;i++)
		{
			add=add+arr[i];
		}
		return add;
	}

}
