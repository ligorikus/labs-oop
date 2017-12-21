package lab3;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Triangle{
	
	public Point x1, x2, x3;
	
	public Triangle(Point x1, Point x2, Point x3){
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
	}
	
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
		this.x1 = new Point(x1, y1);
		this.x2 = new Point(x2, y2);
		this.x3 = new Point(x3, y3);
	}
	
	public double[] lengthOfSide(){
		double[] result = new double[3];
		result[0] = Math.sqrt(Math.pow((this.x2.x - this.x1.x),2) + Math.pow((this.x2.y - this.x1.y),2));
		result[1] = Math.sqrt(Math.pow((this.x3.x - this.x2.x),2) + Math.pow((this.x3.y - this.x2.y),2));
		result[2] = Math.sqrt(Math.pow((this.x3.x - this.x1.x),2) + Math.pow((this.x3.y - this.x1.y),2));
		
		for(int i=0; i < 3; i++){
			result[i] = Math.round(result[i]*100.0)/100.0;
		}
		
		return result;
	}
	
	public double[] angles(){
		double[] lengths = this.lengthOfSide();
		double[] result = new double[3];
		result[0] = Math.acos(
				(Math.pow(lengths[1],2) + Math.pow(lengths[2],2) - Math.pow(lengths[0],2)) / (2*lengths[1]*lengths[2])
			);
		result[1] = Math.acos(
				(Math.pow(lengths[0],2) + Math.pow(lengths[2],2) - Math.pow(lengths[1],2)) / (2*lengths[0]*lengths[2])
			);
		result[2] = Math.acos(
				(Math.pow(lengths[1],2) + Math.pow(lengths[0],2) - Math.pow(lengths[2],2)) / (2*lengths[1]*lengths[0])
			);
		
		for(int i=0; i < 3; i++){
			result[i] = Math.round(Math.toDegrees(result[i])*100.0)/100.0;
		}
		
		return result;
	}
	
	public double perimeter(){
		double[] lengths = this.lengthOfSide();
		return lengths[0] + lengths[1] + lengths[2];
	}
	
	public double area(){
		double[] lengths = this.lengthOfSide();
		double halfOfPerimeter = this.perimeter() / 2;
		return Math.sqrt(
				halfOfPerimeter * (halfOfPerimeter-lengths[0]) * (halfOfPerimeter-lengths[1]) * (halfOfPerimeter-lengths[2])
			);
	}
	
	public static boolean equalDoubleInTriangle(double[] first, double[] second){
		for(int i=0; i<3; i++){
			if(first[i] != second[i]){
				return false;
			}
		}
		return true;
	}
	
	public boolean equalTriangles(Triangle triangle){
		boolean status = true;
		if(this.x1.x != triangle.x1.x || this.x1.y != triangle.x1.y){
			status = false;
		}
		if(this.x2.x != triangle.x2.x || this.x2.y != triangle.x2.y){
			status = false;
		}
		if(this.x3.x != triangle.x3.x || this.x3.y != triangle.x3.y){
			status = false;
		}
		return status;
	}
}
