
public class Rectangle extends Paralellogram{

	public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
	}
	public String toString() {
		return "Rectangle with the four following coordinates: " + getCoordinates() + "\nHas the area: "+ getArea(getHeight(),getBase());
	}
}
