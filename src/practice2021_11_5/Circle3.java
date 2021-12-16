package practice2021_11_5;

public class Circle3 {
	private double radius = 1;
	private static int numberOdObjects = 0;
	public Circle3() {
		numberOdObjects++;
	}
	public Circle3(double newRadius) {
		radius = newRadius;
		numberOdObjects++;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		radius = (newRadius>=0)?newRadius:0;
	}
	public static int getNumberOfObjects() {
		return numberOdObjects;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
