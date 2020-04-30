import java.util.Scanner;
public class Polynome {

	private double Exponent;
	private double Coefficient;
	private Trigonometric TIFunction;
	private Rational RIFunction;
	private Root ROIFunction;
	
	public static Scanner reader=new Scanner(System.in);
	
	public void Polynome(double Exponent, double Coefficient) {
		this.Exponent=Exponent;
		this.Coefficient=Coefficient;
	}
	public void Polynome() {
		this.Exponent=1;
		this.Coefficient=1;
	}
	public void Polynome(double Coefficient, Trigonometric TIFunction, double Exponent) {
		this.Coefficient=Coefficient;
		this.TIFunction=TIFunction;
		this.Exponent=Exponent;
	}
	public void Polynome(double Coefficient, Rational RIFunction, double Exponent) {
		this.Coefficient=Coefficient;
		this.RIFunction=RIFunction;
		this.Exponent=Exponent;
	}
	public void Polynonme(double Coefficient, Root ROIFunction, double Exponent ) {
		this.Coefficient=Coefficient;
		this.ROIFunction=ROIFunction;
		this.Exponent=Exponent;
	}
	public double getExponent() {
		return Exponent;
	}
	public void setExponent(double exponent) {
		Exponent = exponent;
	}
	public double getCoefficient() {
		return Coefficient;
	}
	public void setCoefficient(double coefficient) {
		Coefficient = coefficient;
	}
	public Trigonometric getTIFunction() {
		return TIFunction;
	}
	public void setTIFunction(Trigonometric tIFunction) {
		TIFunction = tIFunction;
	}
	public Rational getRIFunction() {
		return RIFunction;
	}
	public void setRIFunction(Rational rIFunction) {
		RIFunction = rIFunction;
	}
	public Root getROIFunction() {
		return ROIFunction;
	}
	public void setROIFunction(Root rOIFunction) {
		ROIFunction = rOIFunction;
	}

	

	
}