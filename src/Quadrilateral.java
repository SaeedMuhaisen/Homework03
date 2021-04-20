
public class Quadrilateral {
	private Point Point1;
	private Point Point2;
	private Point Point3;
	private Point Point4;
	
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		
		this.Point1=new Point(x1,y1);
		this.Point2=new Point(x2,y2);
		this.Point3=new Point(x3,y3);
		this.Point4=new Point(x4,y4);
	}

	
	public Point getPoint1() {
		return Point1;
	}

	public void setPoint1(Point point1) {
		Point1 = point1;
	}

	public Point getPoint2() {
		return Point2;
	}

	public void setPoint2(Point point2) {
		Point2 = point2;
	}

	public Point getPoint3() {
		return Point3;
	}

	public void setPoint3(Point point3) {
		Point3 = point3;
	}

	public Point getPoint4() {
		return Point4;
	}

	public void setPoint4(Point point4) {
		Point4 = point4;
	}

	public String getCoordinates() {
		return Point1.getCoordinates() + Point2.getCoordinates() + Point3.getCoordinates() + Point4.getCoordinates();
	}


}
