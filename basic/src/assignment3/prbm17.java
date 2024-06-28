package assignment3;

public class prbm17 {

	public static void main(String[] args) {
		int marks=160;
		int total=200;
        float percentage;
        percentage=marks*100/total;
        System.out.println("percentage is :" +percentage);
        if(percentage<=100 && percentage>=91)
        {
        	System.out.println("it is A grade");
        }
        else if(percentage<=90 && percentage>=81)
        {
        	System.out.println("it is B grade");
        }
        else if(percentage<=80 && percentage>=71)
        {
        	System.out.println("it is c grade");
        }
        else if(percentage<=70 && percentage>=61)
        {
        	System.out.println("it is D grade");
        }
        else
        	System.out.println("the candiate is needed to be reappeared");
		
	}

}
