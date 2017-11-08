package lab2;

public class Complex {
	
	private float real;
	private float imaginary;
	
	public Complex(float real, float imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double absoluteValueOfNumber()
	{
		return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
	}
	
	public double argument() throws Exception
	{
		if(this.real > 0 && this.imaginary >= 0)
		{
			return Math.atan(this.imaginary / this.real);
		}
		else if(this.real < 0 && this.imaginary >= 0)
		{
			return (Math.PI - Math.atan(Math.abs(this.imaginary / this.real)));
		}
		else if(this.real < 0 && this.imaginary < 0)
		{
			return (Math.PI + Math.atan(Math.abs(this.imaginary / this.real)));
		}
		else if(this.real > 0 && this.imaginary < 0)
		{
			return (2*Math.PI - Math.atan(Math.abs(this.imaginary / this.real)));
		}
		else if(this.real == 0 && this.imaginary > 0)
		{
			return (Math.PI / 2);
		}
		else if(this.real == 0 && this.imaginary < 0)
		{
			return (3*Math.PI/2);
		}
		throw new Exception("Invalid complex number");
	}
	
	public float exponentiation()
	{
		return 0;
	}
	
	public void print()
	{
		
	}
}              
               