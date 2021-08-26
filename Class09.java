class Caaa{
	public void display() {
		System.out.println("printed from Caaa class");
	}
}
class Cbbb extends Caaa{
	public void display() {
		
		System.out.println("printed from Cbbb class");
	}
}
public class Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa bb=new Cbbb();
		bb.display();
	}

}
