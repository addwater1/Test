package practice2021_10_22;
import java.util.*;
public class TicTacToe {

	public static void main(String[] args) {
		char[][] table = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		int[][] judge = {{0,0,0},{0,0,0},{0,0,0}};
		int[][] judgeX = {{0,0,0},{0,0,0},{0,0,0}};
		int[][] judgeO = {{0,0,0},{0,0,0},{0,0,0}};
		char player;
		int i = 0;
		int[] coor = new int[2];
		for(;;) {
			if(i%2 == 0) {
				player = 'X';
			}
			else {
				player = 'O';
			}
			display(table);
			coor = step(player);
			if(judge[coor[0]][coor[1]] == 1) {
				System.out.println("Error!");
				continue;
			}
			judge[coor[0]][coor[1]] = 1;
			if(i%2 == 0) {
				judgeX[coor[0]][coor[1]] = 1;
				table[coor[0]][coor[1]] = 'X';
				if(judgement(judgeX)>0) {
					display(table);
					System.out.println(player + " player won");
					break;
				}
			}
			else {
				judgeO[coor[0]][coor[1]] = 1;
				table[coor[0]][coor[1]] = 'O';
				if(judgement(judgeO)>0) {
					display(table);
					System.out.println(player + " player won");
					break;
				}
			}
			i++;
		}
	}

	public static void display(char[][] table) {
		for(int i=0; i<3; i++) {
			System.out.println("-------------");
			System.out.println("| " + 
								table[i][0] + 
								" | " +  
								table[i][1] + 
								" | " + 
								table[i][2] + 
								" |");
		}
		System.out.println("-------------");
	}
	
	public static int[] step(char player) {
		int[] coor = new int[2];
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a row for player %c: ",player);
		coor[0] = input.nextInt();
		System.out.printf("Enter a column for player %c: ",player);
		coor[1] = input.nextInt();
		return coor;
	}
	
	public static int judgement(int[][] table) {
		int a = table[0][0]*table[0][1]*table[0][2];
		int b = table[1][0]*table[1][1]*table[1][2];
		int c = table[2][0]*table[2][1]*table[2][2];
		int d = table[0][0]*table[1][0]*table[2][0];
		int e = table[0][1]*table[1][1]*table[2][1];
		int f = table[0][2]*table[1][2]*table[2][2];
		int g = table[0][0]*table[1][1]*table[2][2];
		int h = table[0][2]*table[1][1]*table[2][0];
		return a+b+c+d+e+f+g+h;
	}
}
