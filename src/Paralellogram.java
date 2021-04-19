
public class Paralellogram extends Trapezoid {

	public Paralellogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
	}
	public double getArea() {
		double height;
		double base;
		if(getPoint1().getY()==getPoint2().getY()) {
			base=Math.abs(getPoint2().getX()-getPoint1().getX());
			height=Math.abs(getPoint4().getY()-getPoint1().getY());
		}else if(getPoint1().getY()==getPoint3().getY()) {
			base=Math.abs(getPoint3().getX()-getPoint1().getX());
			height=Math.abs(getPoint1().getY()-getPoint4().getY());
			}
		else {
			base=Math.abs(getPoint4().getX()-getPoint1().getX());
			height=Math.abs(getPoint1().getY()-getPoint2().getY());
		}
		
		
		return height*base;
	}
	@Override
	public String toString() {
		return "Parallelogram with the four following coordinates: " + getCoordinates() + "\nHas the area: "+ getArea();
	}
	
		
	

	
}

