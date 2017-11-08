package lab2;

public class Complex {
	
	private double real;
	private double imaginary;
	
	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public Complex(double real, double imaginary)
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
		
		throw new Exception();
	}
	
	public double exponentiation(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		try {
			double absoluteInExp = Math.pow(this.absoluteValueOfNumber(), n);
			double realCos = Math.cos(n * this.argument());
			double realSin = Math.sin(n * this.argument());
			System.out.println(absoluteInExp + "(" + realCos + " + " + realSin + "i");
		} catch (Exception e) {
			System.err.println("Error in calculate exponent of complex number");
		}
		
		return 0;
	}
	
	public void print()
	{
		System.out.println(this.real + " + " + this.imaginary + "i");
	}
}              
               