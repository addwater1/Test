package practice2021_10_15;
import java.util.*;
public class Isbn {

	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		int i;
		int digit = 0;
		String isbn = inpScanner.next();
		int value = Integer.parseInt(isbn);
		for(i = 9; i >=1 ; i--) {
			digit = digit + (value % 10) * i;
			value /= 10;
		}
		digit = digit % 11;
		if(digit == 10) {
			System.out.println("The ISBN-10 number is " + isbn + 'X');
		}
		else {
			System.out.println("The ISBN-10 number is " + isbn + digit);
		}
		// TODO Auto-generated method stub

	}

}
