package oops;
interface playable{
	public void play();
}
class guitar implements playable{
	public void play() {
		System.out.println("i was playing guitar");
	}
}
class piano implements playable{
	public void play() {
		System.out.println("i can play piano");
	}
}
public class interfaceex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guitar g=new guitar();
		g.play();
		piano p=new piano();
		p.play();

	}

}
