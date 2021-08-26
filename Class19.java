class CRectangle{
	protected int length;
	protected int width;
	public CRectangle(int l,int w) {
		length=l;
		width=w;
	}
	public int area() {
		return width*length;
	}
	public String toString()    // §ï¼gtoString() method
	   {
	      String str="length="+length+","+"width="+width+","+"area="+(length*width);
	      return str;
	   }
	
}
public class Class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle rect=new CRectangle(2, 6);
		System.out.println(rect.toString());


	}

}
