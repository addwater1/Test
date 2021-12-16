package practice2021_11_12;
public class QuadraticEquation {
	private double a,b,c;
	public QuadraticEquation(double num1,double num2,double num3) {
		a = num1;
		b = num2;
		c = num3;
	}
	void getA(double num) {
		this.a = num;
	}
	void getB(double num) {
		this.b = num;
	}
	void getC(double num) {
		this.c = num;
	}
	double getDiscriminant() {
		return b*b-4*a*c;
	}
	double getRoot1() {
		if(this.getDiscriminant()>=0)
			return (-1*b+Math.sqrt(b*b-4*a*c))/(2*a);
		else
			return 0;
	}
	double getRoot2() {
		if(this.getDiscriminant()>=0)
			return (1*b+Math.sqrt(b*b-4*a*c))/(2*a);
		else
			return 0;
	}
}
