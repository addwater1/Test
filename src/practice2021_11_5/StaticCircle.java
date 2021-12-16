package practice2021_11_5;
public class StaticCircle {
	double radius;
	static int numberOfObjects = 0;
	StaticCircle() {
		radius = 1;
		numberOfObjects++;
	}
	StaticCircle(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
}
