package practice2021_11_5;
public class Circle {
	double radius;
	Circle(){
		radius = 1;
	}
	Circle(double newCircle){
		radius = newCircle;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
