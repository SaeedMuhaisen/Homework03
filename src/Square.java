
public class Square extends Rectangle{

	public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
	}
	public double getArea() {
		double Side;
		if(getPoint1().getY()==getPoint2().getY()) {
		Side=Math.abs(getPoint2().getX()-getPoint1().getX());
		}else if(getPoint1().getY()==getPoint3().getY()) {
				Side=Math.abs(getPoint3().getX()-getPoint1().getX());
			}
			else {
				Side=Math.abs(getPoint4().getX()-getPoint1().getX());
			
		}
	
	return Side*Side;
	}
	public String toString() {
		return "Square with the four following coordinates: " + getCoordinates() + "\nHas the area: "+ getArea();
	}
	
}
