package practice2021_10_15;
import java.util.*;
public class DisplayPyramid {

	public static void main(String[] args) {
		Scanner nScanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = nScanner.nextInt();
		int i,j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=2*n-1; j++) {
				if(j>=8-i && j<=6+i) {
					System.out.printf(Math.abs(7-j)+1 + " ");
				}
				else {
					System.out.printf("  ");
				}
			}
			System.out.printf("\n");
		}
		// TODO Auto-generated method stub

	}

}
