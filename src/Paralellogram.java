public class Paralellogram extends Trapezoid {
	private double Base;
	public Paralellogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		setBase();
	}
	public double getBase() {	
		return Base;
	}
	
	public void setBase() {
		if(getPoint1().getY()==getPoint2().getY()) {
			Base=Math.abs(getPoint2().getX()-getPoint1().getX());
		}
		else if(getPoint1().getY()==getPoint3().getY()) {
			Base=Math.abs(getPoint3().getX()-getPoint1().getX());
		}
		else {
			Base=Math.abs(getPoint4().getX()-getPoint1().getX());
		}
	}
	@Override
	public String toString() {
		return "Parallelogram with the four following coordinates: " + getCoordinates() + "\nHas the area: "+ getArea(getHeight(),Base);
	}
	
		
	

	
}