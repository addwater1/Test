package practice2021_10_15;

public class CalculateE {

	public static void main(String[] args) {
		double i;
		double t = 1;
		double sum = 1;
		for(i=1; i<=100; i++) {
			t *= i;
			sum += 1/t;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
