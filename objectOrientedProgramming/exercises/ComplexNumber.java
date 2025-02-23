package objectOrientedProgramming.exercises;

public class ComplexNumber
{
	// write code here
	private double real;
	private double imaginary;

	public ComplexNumber(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}

	public void add(double real, double imaginary)
	{
		this.real += real;
		this.imaginary += imaginary;
	}

	public void add(ComplexNumber complexNumber)
	{
		this.add(complexNumber.real, complexNumber.imaginary);
	}

	public void subtract(double real, double imaginary)
	{
		this.real -= real;
		this.imaginary -= imaginary;
	}

	public void subtract(ComplexNumber complexNumber)
	{
		this.subtract(complexNumber.real, complexNumber.imaginary);
	}

	public double getReal()
	{
		return this.real;
	}

	public double getImaginary()
	{
		return this.imaginary;
	}
}