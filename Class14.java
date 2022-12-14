/**
 * 
 */
package Java11;

interface iVolume{
	public void showData();
	public double vol();
}
abstract class CSphere implements iVolume{
	final double PI=3.14;
	protected int x;
	protected int y;
}
class CCircle extends CSphere{
	protected int radius;
	public CCircle(int a,int b,int r) {
		x=a;
		y=b;
		radius=r;
	}
	public void showData() {
		System.out.println("球心:("+x+","+y+")");
		System.out.println("半徑:"+radius);
		System.out.println("球體積:"+vol());
	}
	public double vol() {
		return ((4.0/3)*PI*radius*radius*radius);
	}
}

public class class14{
	public static void main(String args[]) {
		CCircle cir=new CCircle(8,6,2);
		cir.showData();
	}
}
