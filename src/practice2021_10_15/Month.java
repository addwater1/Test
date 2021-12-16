package practice2021_10_15;
import java.util.*;
public class Month {

	public static void main(String[] args) {
		String message = new String();
		int i = (int)(Math.random()*12 + 1);
		System.out.println(i);
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
		System.out.println(message);
		// TODO Auto-generated method stub

	}

}
