package practice2021_10_15;
import java.util.*;
public class DisplayDayOfWeek {

	public static void main(String[] args) {
		Scanner yearScanner = new Scanner(System.in);
		int year = yearScanner.nextInt();
		int i;
		String str = new String();
		String message = new String();
		for(i=1; i<=12; i++) {
			switch(f(year, i, 1)) {
			  case 0: str = "Saturday"; break;
			  case 1: str = "Sunday"; break;
			  case 2: str = "Monday"; break;
			  case 3: str = "Tuesday"; break;
			  case 4: str = "Wednesday"; break;
			  case 5: str = "Thursday"; break;
			  case 6: str = "Friday"; break;
			}
			switch(i) {
			  case 1: message = "January";
			          break;
			  case 2: message = "February";
			          break;
			  case 3: message = "March";
			          break;
			  case 4: message = "April";
			          break;
			  case 5: message = "May";
			          break;
			  case 6: message = "June";
			          break;
			  case 7: message = "July";
			          break;
			  case 8: message = "Auguest";
			          break;
			  case 9: message = "September";
			          break;
			  case 10: message = "October";
			          break;
			  case 11: message = "November";
			          break;
			  case 12: message = "December";
			          break;
			}
			System.out.println(message + 1 + ", " + year + " is " + str);
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
