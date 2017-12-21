package lab3;

public class Show {
	
	private EquilateralTriangle equilateralTriangles[];
	
	public Show(EquilateralTriangle[] equilateralTriangles){
		this.equilateralTriangles = equilateralTriangles;
	}
	
	public double minEquilateral(){
		if(this.equilateralTriangles.length == 0){
			return -1;
		}
		double minEquilateral = this.equilateralTriangles[0].lengthOfMedian();
		for(int i = 0; i < this.equilateralTriangles.length; i++){
			if(minEquilateral >= this.equilateralTriangles[i].lengthOfMedian()){
				minEquilateral = this.equilateralTriangles[i].lengthOfMedian();
			}
		}
		return minEquilateral;
	}
}
