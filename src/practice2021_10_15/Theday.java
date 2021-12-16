package practice2021_10_15;
import java.util.*;
public class Theday {

	public static void main(String[] args) {
		Scanner yearScanner = new Scanner(System.in);
		Scanner monthScanner = new Scanner(System.in);
		Scanner dayScanner = new Scanner(System.in);
		int q,m,k,j,h;
		String str = new String();
		System.out.println("Enter year: ");
		int year = yearScanner.nextInt();
		System.out.println("Enter month: ");
		int month = monthScanner.nextInt();
		System.out.println("Enter the day of the month: ");
		int day = dayScanner.nextInt();
		if(month == 1 || month == 2) {
			month = month+12;
			year--;
		}
		q = day;
		m = month;
		j = year/100;
		k = year%100;
		h = (q + (int)(26*(m+1)/10.0) + k + (int)(k/4.0) + (int)(j/4.0) + 5*j) % 7;
		switch(h) {
		  case 0: str = "Saturday"; break;
		  case 1: str = "Sunday"; break;
		  case 2: str = "Monday"; break;
		  case 3: str = "Tuesday"; break;
		  case 4: str = "Wednesday"; break;
		  case 5: str = "Thursday"; break;
		  case 6: str = "Friday"; break;
		}
		System.out.println("Day of the week is " + str);
		// TODO Auto-generated method stub

	}

}
