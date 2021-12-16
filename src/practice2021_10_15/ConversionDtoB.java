package practice2021_10_15;
import java.util.*;
public class ConversionDtoB {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int input = inScanner.nextInt();
		int i;
		String output = new String();
		for(;input != 0;) {
			output = input%2+"" + output;
			input /= 2;
		}
		System.out.println(output);
		
		// TODO Auto-generated method stub

	}

}
