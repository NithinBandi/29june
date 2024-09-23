package arrays;

public class seclargarr {

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        findseclar(arr);
    }

    public static void findseclar(int[] arr) {
    	int min=0;
        int lar = min;
        int seclarg = min;

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > seclarg && arr[i] < lar) {
                seclarg = arr[i];
            }
        }

        System.out.println("Second largest number in array is: " + seclarg);
    }
}
