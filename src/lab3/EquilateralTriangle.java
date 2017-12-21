package lab3;

public class EquilateralTriangle extends Triangle{

	public EquilateralTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		super(x1, y1, x2, y2, x3, y3);
	}

	public EquilateralTriangle(Point x1, Point x2, Point x3){
		super(x1, x2, x3);
	}
	
	public boolean isEquilateral()
	{
		double[] lengths = this.lengthOfSide();
		if(lengths[0] == lengths[1] && lengths[1] == lengths[2] && lengths[0] == lengths[2]){
			return true;
		}
		return false;
	}
	
	public double lengthOfMedian()
	{
		if(!this.isEquilateral()){
			return -1;
		}
		
		double length = Math.sqrt(Math.pow((this.x2.x - this.x1.x),2) + Math.pow((this.x2.y - this.x1.y),2));
		double lengthOfMedian = Math.sqrt(Math.pow(length, 2) - Math.pow(length / 2, 2));
		
		return Math.round(lengthOfMedian * 100.0)/100.0;
	}
}
