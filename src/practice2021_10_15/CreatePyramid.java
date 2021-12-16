package practice2021_10_15;

public class CreatePyramid {

	public static void main(String[] args) {
		int n = 8;
		int i,j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=2*n-1; j++) {
				if(j>=9-i && j<=7+i) {
					System.out.printf("%4d",(int)(Math.pow(2, i-Math.abs(8-j)-1)));
				}
				else {
					System.out.printf("    ");
				}
			}
			System.out.printf("\n");
		}
		// TODO Auto-generated method stub

	}

}
