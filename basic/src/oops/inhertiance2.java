package oops;
class vechilee{
	private String name;
	private int year;
	
	public vechilee(String name,int year) {
		this.name=name;
		this.year=year;
	}
	public void displayInfo() {
		System.out.println("name of car is:"+name);
		System.out.println("year of car is:"+year);
	}
}
class Caar extends vechilee{
	private int numberofdoors;
	public Caar(String name,int year,int numberofdoors)
	{
		super(name,year);
		this.numberofdoors=numberofdoors;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("number of doors are "+numberofdoors);
	}
	
	
}
class Bikee extends vechilee{
	private String model;
	public Bikee(String name,int year,String model) {
		super(name,year);
		this.model=model;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("model number is"+model);
	}
}




public class inhertiance2 {

	public static void main(String[] args) {
		Caar mycar=new Caar("toyata",2015,4);
		mycar.displayInfo();
		Bikee mybike=new Bikee("rx100",2020,"2024");
		mybike.displayInfo();

	}

}
