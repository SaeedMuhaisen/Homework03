
public class Rectangle extends Paralellogram{

	public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
	}
	public double getArea() {
		double Side1;
		double Side2;
		if(getPoint1().getY()==getPoint2().getY()){
			Side1=Math.abs(getPoint2().getX()-getPoint1().getX());
			Side2=Math.abs(getPoint3().getY()-getPoint1().getY());
			}
		else if(getPoint1().getY()==getPoint3().getY()) {
			Side1=Math.abs(getPoint3().getX()-getPoint1().getX());
			Side2=Math.abs(getPoint4().getY()-getPoint1().getY());
		}
		else {
			Side1=Math.abs(getPoint4().getX()-getPoint1().getX());
			Side2=Math.abs(getPoint2().getY()-getPoint1().getY());
		}
		
		return Side1*Side2;
	}
	public String toString() {
		return "Rectangle with the four following coordinates: " + getCoordinates() + "\nHas the area: "+ getArea();
	}
}
