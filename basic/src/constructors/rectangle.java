/*Write a Java class called Rectangle with private fields for length and width. Create
a constructor that takes in a length and width as parameters and initializes the fields.
Also, create a method called calculateArea that returns the area of the rectangle
(length * width).*/
package constructors;
public class rectangle {
private int length;
private int width;
   public rectangle(int length,int width)
   {
	   this.length=length;
	   this.width=width;
   }
   public void calculatearea()
   {
	   System.out.println("area is:"+length*width);
   }

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		rectangle area=new rectangle(20,30);
        area.calculatearea();
	}

}
