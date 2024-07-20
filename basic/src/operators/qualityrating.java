/*. A certain grade of steel is graded according to the following conditions
1. Hardness must be greater than 50
2. Carbon content must be less than 0.7
3. Tensile strength must be greater than 5600
The grades are as follows:
● Grade is 10 if all three conditions are met
● Grade is 9 if conditions (i) and (ii) are met
● Grade is 8 if conditions (ii) and (iii) are met
● Grade is 7 if conditions (i) and (iii) are met
● Grade is 6 if only one condition is met
● Grade is 5 if none of the conditions are met
Write a program, which will require the user to give values of hardness, carbon content and tensile strength of
the steel under consideration and output the grade of the steel.
*/
package operators;
import java.util.Scanner;
public class qualityrating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hardness of material");
		int a=sc.nextInt();
        System.out.println("enter the carbon content");
        float b=sc.nextFloat();
        System.out.println("enter the tensile strenth");
        int c=sc.nextInt();
        
	
    if(a>50 && b<0.7 && c>5600)
    {
    	System.out.println("its a grade 10 material");
    }
    else if(a>50 && b<0.7 )
    {
    	System.out.println("its a grade 9 material");
    }
    else if(b<0.7 && c>5600)
    {
    	System.out.println("its a grade 8 material");
    }
    else if(a>50 && c>5600)
    {
    	System.out.println("its a grade 7 material");
    }
    else if(a>50 || b<0.7 || c>5600)
    {
    	System.out.println("its a grade 6 material");
    }
    else
    {
    	System.out.println("its a grade 5 material");
    }
	}
}

