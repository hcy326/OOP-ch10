package Class17a;
class car{
	protected String owner;
	protected String id;
	final void show() {
		System.out.println("車主姓名："+owner);
		System.out.println("車牌號碼："+id);
	}
	public car(String own,String s) {
		owner=own;
		id=s;
	}
}
class CColor extends car{
	protected String color;
	public CColor(String own,String s,String col) {
		super(own,s);
		color=col;
	}

}
public class Class17a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CColor mycar=new CColor("Riaan", "A1-2345", "black");
		mycar.show();
		System.out.println("車身顏色"+mycar.color);
	}

}
// 因為父類別設定終止繼承