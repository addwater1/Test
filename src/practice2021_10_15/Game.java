package practice2021_10_15;
import java.util.*;
public class Game {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int lottery = (int)(Math.random() * 900 + 100);
		System.out.println("The lottery number is: " + lottery);
		System.out.println("Enter your number: ");
		int input = inputScanner.nextInt();
		int cash = 0;
		int i,j;
		int[] list = new int[3];
		int[] listIn = new int[3];
		int[][] mat = {
			{0,0,0},
			{0,0,0},
			{0,0,0},
		};
		list[0] = lottery%10;
		list[1] = lottery/10%10;
		list[2] = lottery/100;
		listIn[0] = input%10;
		listIn[1] = input/10%10;
		listIn[2] = input/100;
		if(input == lottery) {
			cash = 10000;
		}
		else {
			for(i = 0; i <= 2; i++) {
				for(j = 0; j <=2; j++) {
					if(list[i] == listIn[j]) {
						mat[i][j] = 1;
						cash = 1000;
					}
				}
			}
			if(Math.abs(mat[0][0]*mat[1][1]*mat[2][2]
			  +mat[0][1]*mat[1][2]*mat[2][0]	
			  +mat[0][2]*mat[1][0]*mat[2][1]						
			  -mat[0][2]*mat[1][1]*mat[2][0]						
			  -mat[0][0]*mat[1][2]*mat[2][1]
			  -mat[2][2]*mat[1][0]*mat[0][1]) == 1) {
				cash = 3000;
			}
		}
		System.out.println("You deserve " + cash + " dollars");
		// TODO Auto-generated method stub

	}

}
