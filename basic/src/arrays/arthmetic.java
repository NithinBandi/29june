package arrays;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try { 
            System.out.println("Enter the number of elements to be entered in the first array:");
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter an element:");
                a[i] = sc.nextInt();
            }
            
            System.out.println("Enter the number of elements to be entered in the second array:");
            int l = sc.nextInt();
            int[] b = new int[l];
            for (int i = 0; i < l; i++) {
                System.out.println("Enter an element:");
                b[i] = sc.nextInt();
            }
            
            if (a.length != b.length) {
                System.out.println("Arrays' lengths should be the same");
                return; // Exit the program if lengths are not the same
            }
            
            int[] sum = addArrays(a, b);
            int[] diff = subArrays(a, b);
            int[] prod = multArrays(a, b);
            int[] division = divideArrays(a, b);
            
            // Display results
            System.out.println("Doing addition:");
            printArray(sum);
            System.out.println("Doing subtraction:");
            printArray(diff);
            System.out.println("Doing multiplication:");
            printArray(prod);
            System.out.println("Doing division:");
            printArray(division);
            
        } finally {
            sc.close(); // Close the Scanner
        }
    }
    
    // Method to add two arrays
    public static int[] addArrays(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }
    
    // Method to subtract two arrays
    public static int[] subArrays(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }
    
    // Method to multiply two arrays
    public static int[] multArrays(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }
    
    // Method to divide two arrays
    public static int[] divideArrays(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] != 0) {
                result[i] = a[i] / b[i];
            } else {
                System.out.println("Division by zero at index " + i);
                result[i] = 0; // Handle division by zero
            }
        }
        return result;
    }
    
    // Method to print an array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
