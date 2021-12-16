package practice2021_11_12;

public class LinearEquation {
	private double a,b,c,d,e,f;
	LinearEquation(double n1,double n2,double n3,double n4,double n5,double n6){
		a = n1;
		b = n2;
		c = n3;
		d = n4;
		e = n5;
		f = n6;
	}
	void setA(double num) {
		a = num;
	}
	void setB(double num) {
		b = num;
	}
	void setC(double num) {
		c = num;
	}
	void setD(double num) {
		d = num;
	}
	void setE(double num) {
		e = num;
	}
	void setF(double num) {
		f = num;
	}
	boolean isSolvable() {
		if(a*d-b*c == 0)
			return false;
		else
			return true;
	}
	double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}
