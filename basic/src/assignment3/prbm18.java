package assignment3;

public class prbm18 {

	public static void main(String[] args) {
		float bonus,salary=100000;
				if(salary<=10000 && salary>0) {
					bonus=2*salary/100;
		           System.out.println("bonus is:" +bonus);
				}
		        if(salary >10000 && salary<=30000) {
					bonus=3*salary/100;
			       System.out.println("bonus is:" +bonus);
		        }
			    if(salary>30000 && salary<=50000)
			    {	bonus=4*salary/100;
				    System.out.println("bonus is:" +bonus);
			    }
				    if(salary>50000)
				    {   bonus=5*salary/100;
				    System.out.println("bonus is:" +bonus);
				    }
	}

}
