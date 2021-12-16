package practice2021_10_15;

public class DisplayLeapYear {

	public static void main(String[] args) {
		int i;
		int t = 0;
		for(i=101; i<=2100; i++) {
			if(i%4==0 && i%100!=0) {
				System.out.printf("%5d",i);
				t++;
				if(t%10 == 0) {
					System.out.printf("\n");
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
