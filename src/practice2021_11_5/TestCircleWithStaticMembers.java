package practice2021_11_5;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle object is " + 
		  StaticCircle.numberOfObjects);
		StaticCircle c1 = new StaticCircle();
		System.out.println("\nAfter craeting c1");
		System.out.println("c1: radius (" + c1.radius + 
		  ") and number of Circle objects (" + 
		  c1.numberOfObjects + ")");
		StaticCircle c2 = new StaticCircle(5);
		c1.radius = 9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + 
		  ") and number of Circle objects (" + 
		  c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + 
		  ") and number of Circle objects (" + 
		  c2.numberOfObjects + ")");
	}

}
