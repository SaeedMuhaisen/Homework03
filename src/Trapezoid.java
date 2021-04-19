
public class Trapezoid extends Quadritals {

	
		
	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		
	}

	public double getArea(){
		double Height;
		double SidesSum;
		if(getPoint1().getY()==getPoint2().getY()){
			Height=Math.abs(getPoint3().getY()-getPoint1().getY());
		}
		else{
			Height=Math.abs(getPoint2().getY()-getPoint1().getY());	
			}
		
		if(getPoint1().getY()==getPoint2().getY()) {
			SidesSum=Math.abs(getPoint2().getX()-getPoint1().getX())+Math.abs(getPoint4().getX()-getPoint3().getX());
		}else if(getPoint1().getY()==getPoint3().getY()){
			SidesSum=Math.abs(getPoint3().getX()-getPoint1().getX())+Math.abs(getPoint4().getX()-getPoint2().getX());
		}
		else {
			SidesSum=Math.abs(getPoint4().getX()-getPoint1().getX())+Math.abs(getPoint3().getX()-getPoint2().getX());
		}
		return Height*SidesSum*0.5;
			
		}
		 
		
		
	public String toString() {
		return "Trapezoid with the four following coordinates: "+ getCoordinates() + "\nHas the area: "+ getArea();
	}


	

}