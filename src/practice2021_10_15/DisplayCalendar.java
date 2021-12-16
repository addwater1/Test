package practice2021_10_15;
import java.util.*;
public class DisplayCalendar {

	public static void main(String[] args) {
		Scanner yearScanner = new Scanner(System.in);
		int year = yearScanner.nextInt();
		int i,j;
		int t = 1;
		int nextYear = year;
		for(i=1; i<=12; i++) {
			if(i == 12) {
				nextYear++;
			}
			for(j=1; j<=42; j++) {
				if(t>=28 && j%7==f(nextYear, i%12+1, 1)) {
					System.out.printf("\n");
					break;
				}
				if(j>=(f(year, i, 1)+6)%7+1) {
					System.out.printf("%4d",t);
					t++;
					if(j%7 == 0) {
						System.out.printf("\n");
					}
				}
				else {
					System.out.printf("    ");
				}
			}
			t=1;
		}
		
		// TODO Auto-generated method stub

	}
	
	public static int f(int year,int month,int day) {
		int q,m,j,k,h;
		if(month == 1 || month == 2) {
			month = month+12;
			year--;
		}
		q = day;
		m = month;
		j = year/100;
		k = year%100;
		h = (q + (int)(26*(m+1)/10.0) + k + (int)(k/4.0) + (int)(j/4.0) + 5*j) % 7;
		return h;
	}

}
