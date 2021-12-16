package practice2021_10_15;

public class SearchPerfectNumber {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=10000; i++) {
			if(i == f(i)) {
				System.out.println(i);
			}
		}
		// TODO Auto-generated method stub

	}
	
	public static int f(int num) {
		int i;
		int sum = 0;
		for(i=1; i<=num/2; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
