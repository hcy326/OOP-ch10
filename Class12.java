package Class12;


class CShape{
	protected double radius;
	protected double pi=3.14;
	protected double base;
	protected double height;
	protected double width;
	public double area() {
		return 0.0;
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
public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 CShape shp[]=new CShape [6];
		 shp[0]=new CCircle(5.0);;
		 shp[1]=new CCircle(9.0);
		 shp[2]=new CSquar(5.0);
		 shp[3]=new CSquar(9.0);
		 shp[4]=new CTriangle(5.0, 8.0);
		 shp[5]=new CTriangle(3.0, 8.0);
		 for(int i=0;i<shp.length;i++)
			 System.out.println("area = "+shp[i].area());
		 System.out.println("This largest area is "+largest(shp));
}		
		 public static double largest(CShape a[]) {
			double max=a[0].area();
			for(int i=0;i<a.length;i=i+1)
				if (a[i].area()>max)
					max=a[i].area();		
			return max;
		
	}

}
