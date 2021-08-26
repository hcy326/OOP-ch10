
class Caaa{
	public int num1;
	public int num2;
	public Caaa(){
		num1=1;
		num2=1;
	}
	public Caaa(int a,int b){
		num1=a;
		num2=b;
	}
}
class Cbbb extends Caaa{
	public Cbbb() {
		
	}
	 
	public Cbbb(int a,int b)      
	 {
	      super();
	      
	      }
	public void show() {
		System.out.println("num1 = "+num1+" num2 = "+num2);
	}
}
public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb=new Cbbb();
		Cbbb b=new Cbbb(5,10);
		bb.show();
		b.show();
	}

}
