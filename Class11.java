package Class11;

class CShape{
	protected double radius;
	protected double pi=3.14;
	protected double base;
	protected double height;
	protected double width;
	public double area() {
		return 0.0;
	}
	public static double largest(double a[]) {
		double max=0;
		for(int i=0;i<a.length;i=i+1)
			if (a[i]>max)
				max=a[i];		
		return max;
	}
}
class CCircle extends CShape {
	public CCircle(double r){
		 radius=r;
		 System.out.println("Circle = "+area());
	}
	public double area() {
		return radius*radius*pi;
	}
}
class CSquar extends CShape {
	public CSquar(double w) {
		width=w;
		System.out.println("Squar = "+area());
	}
	public double area() {
		return width*width;
	}
}
class CTriangle extends CShape {
	public CTriangle(double b,double h) {
		base=b;
		height=h;
		System.out.println("Triangle = "+area());
	}
	public double area() {
		return base*height/2;
	}

}
public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CCircle r=new CCircle(5.0);
		CCircle rr=new CCircle(9.0);
		CSquar w=new CSquar(5.0);
		CSquar ww=new CSquar(9.0);
		CTriangle t=new CTriangle(5.0, 8.0);
		CTriangle tt=new CTriangle(3.0, 8.0);
		double a[]=new double [6];
		a[0]=r.area();
		a[1]=rr.area();
		a[2]=w.area();
		a[3]=ww.area();
		a[4]=t.area();
		a[5]=tt.area();
		System.out.println("largest = "+CShape.largest(a));

	}

}
