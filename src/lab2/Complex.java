package lab2;

public class Complex{
	
	private double real;
	private double imaginary;
	/**
	 * get real number of complex number
	 * @return double real
	 */
	public double getReal() {
		return real;
	}
	/**
	 * get imaginary number of complex number
	 * @return
	 */
	public double getImaginary() {
		return imaginary;
	}
	/**
	 * Complex constructor
	 * @param real
	 * @param imaginary
	 */
	public Complex(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	/**
	 * Absolute value of complex number
	 * @return double
	 */
	public double absoluteValueOfNumber()
	{
		return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
	}
	/**
	 * Get argument of complex number
	 * @return double
	 * @throws Exception
	 */
	public double argument() throws Exception
	{
		double argument;
		if(this.real > 0 && this.imaginary >= 0)
		{
			argument = Math.atan(this.imaginary / this.real);
		}
		else if(this.real < 0 && this.imaginary >= 0)
		{
			argument = (Math.PI - Math.atan(Math.abs(this.imaginary / this.real)));
		}
		else if(this.real < 0 && this.imaginary < 0)
		{
			argument = (Math.PI + Math.atan(Math.abs(this.imaginary / this.real)));
		}
		else if(this.real > 0 && this.imaginary < 0)
		{
			argument = (2*Math.PI - Math.atan(Math.abs(this.imaginary / this.real)));
		}
		else if(this.real == 0 && this.imaginary > 0)
		{
			argument = (Math.PI / 2);
		}
		else if(this.real == 0 && this.imaginary < 0)
		{
			argument = (3*Math.PI/2);
		}
		else
			throw new Exception();
		return argument;
	}
	/**
	 * pow complex number 
	 * @param n
	 * @return Complex 
	 */
	public Complex exponentiation(int n)
	{
		if(n == 0){
			return new Complex(1,0);
		}
		try {
			double absInExp = Math.pow(this.absoluteValueOfNumber(), n);
			double realCos = Math.cos(n * this.argument());
			double realSin = Math.sin(n * this.argument());
			
			
			return new Complex(absInExp*realCos, absInExp*realSin);
		} catch (Exception e) {
			System.err.println("Error in calculate exponent of complex number");
		}
		
		return new Complex(0,0);
	}
	/**
	 * Print complex number
	 */
	public void print()
	{
		System.out.println(toString());
	}

	public String toString()
	{
		return this.real + " + " + this.imaginary + "i";
	}
	
	public boolean equals(Object obj)
	{
	    if(obj == this)
	    	return true;

	    if(obj == null)
	    	return false;

	    if(!(getClass() == obj.getClass()))
	    	return false;
	    else
	    {
	      Complex tmp = (Complex)obj;
	      boolean status = true;
	      
	      if(tmp.real != this.real)
	    	  status = false;
	      if(tmp.imaginary != this.imaginary)
	    	  status = false;
	      return status;
	    }
	}
	
	public static boolean equals(Complex first, Complex second)
	{
		if(first == second)
	    	return true;

	    if(first == null)
	    	return false;
	    if(second == null)
	    	return false;
	    
	    Complex tmpFirst = (Complex)first;
	    Complex tmpSecond = (Complex)second;
	    boolean status = true;
	    if(Math.round(tmpFirst.real*100) != Math.round(tmpSecond.real*100)){
	    	status = false;
	    }
	    
	    if(Math.round(tmpFirst.imaginary*100) != Math.round(tmpSecond.imaginary*100)){
	    	status = false;
	    }
	    	
	    return status;

	}
}              
               