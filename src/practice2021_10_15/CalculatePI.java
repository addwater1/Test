package practice2021_10_15;

public class CalculatePI {
	
	public static void main(String[] args) {
		double i;
		double t = 1;
		double sum = 0;
		for(i=1; i<=100; i++) {
			sum += t/(2*i-1);
			t *= -1;
		}
		sum = 4 * sum;
		System.out.println(sum);
	}

}
