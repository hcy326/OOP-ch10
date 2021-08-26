package Class06;
class CTringle{
	protected int base;
	protected int height;
	protected void show() {
		System.out.println("base = "+base+",height = "+height);
	}
}
class CData extends CTringle{
	public CData(){

	}
	public CData(int b,int h){
		base=b; 
		height=h;
		System.out.println("base = "+base+",height = "+height);
		System.out.println("area = "+area());
	}
	public double area(){
		return base*height/2;
	}
	
}
public class Clsaa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CData obj=new CData(3,8);
		obj.area();
	}

}
