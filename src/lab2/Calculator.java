package lab2;

public class Calculator {
	
	public static Complex addition(Complex first, Complex second)
	{
		double real = first.getReal() + second.getReal();
		double imaginary = first.getImaginary() + second.getImaginary();
		
		return new Complex(real, imaginary);
	}

	public static Complex subtraction(Complex first, Complex second)
	{
		double real = first.getReal() - second.getReal();
		double imaginary = first.getImaginary() - second.getImaginary();
		
		return new Complex(real, imaginary);
	}
	
	public static Complex multiplication(Complex first, Complex second)
	{
		double real = first.getReal()*second.getReal() - first.getImaginary()*second.getImaginary();
		double imaginary = first.getReal()*second.getImaginary() + first.getImaginary()*second.getReal();
		
		return new Complex(real, imaginary);
	}

	public static Complex division(Complex first, Complex second)
	{
		double real = (first.getReal()*second.getReal() + first.getImaginary()*second.getImaginary())
				/ (Math.pow(second.getReal(), 2) + Math.pow(second.getImaginary(), 2));
		double imaginary = (first.getReal()*second.getImaginary() - first.getImaginary()*second.getReal())
				/ (Math.pow(second.getReal(), 2) + Math.pow(second.getImaginary(), 2));
		
		return new Complex(real, imaginary);
	}
}
