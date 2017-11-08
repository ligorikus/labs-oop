package lab2;

public class Calculator {
	
	Complex first;
	Complex second;
	
	public Calculator(Complex first, Complex second)
	{
		this.first  = first;
		this.second = second;
	}
	
	public Complex addition()
	{
		double real = this.first.getReal() + this.second.getReal();
		double imaginary = this.first.getImaginary() + this.second.getImaginary();
		
		return new Complex(real, imaginary);
	}

	public Complex subtraction()
	{
		double real = this.first.getReal() - this.second.getReal();
		double imaginary = this.first.getImaginary() - this.second.getImaginary();
		
		return new Complex(real, imaginary);
	}
	
	public Complex multiplication()
	{
		double real = first.getReal()*second.getReal() - first.getImaginary()*second.getImaginary();
		double imaginary = first.getReal()*second.getImaginary() + first.getImaginary()*second.getReal();
		
		return new Complex(real, imaginary);
	}

	public Complex division()
	{
		double real = (first.getReal()*second.getReal() - first.getImaginary()*second.getImaginary())
				/ (Math.pow(second.getReal(), 2) + Math.pow(second.getImaginary(), 2));
		double imaginary = (first.getReal()*second.getImaginary() + first.getImaginary()*second.getReal())
				/ (Math.pow(second.getReal(), 2) + Math.pow(second.getImaginary(), 2));
		
		return new Complex(real, imaginary);
	}
}
