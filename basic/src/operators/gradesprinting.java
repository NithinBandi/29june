/*Write a program that takes a grade as input (A, B, C, D, or F) and prints a corresponding message based on
the grade using a Switch Statements.*/
package operators;
import java.util.Scanner;
public class gradesprinting {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a new character");
		 String name=sc.nextLine();
         switch(name) {
         case "A":
         {
        	 System.out.println("you passed with distintion");
             break;
         }
         case "B":
         {
        	 System.out.println("you passed with b grade");
             break;
         }
         case "C":
         {
        	 System.out.println("you passed with c grade");
             break;
         }
         default:
         {
        	 System.out.println("you are failed");
         }
		 
	}}

}
