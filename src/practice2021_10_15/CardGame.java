package practice2021_10_15;
import java.util.*;
public class CardGame {

	public static void main(String[] args) {
		int n = (int)(Math.random()*13 + 1);
		int m = (int)(Math.random()*4 + 1);
		String name = new String();
		String theme = new String();
		System.out.println(n + " " + m);
		switch(n) {
		  case 1: name = "Ace";break;
		  case 11: name = "Jack";break;
		  case 12: name = "Queen";break;
		  case 13: name = "King";break;
		  default: name = n + "";
		}
		switch(m) {
		  case 1: theme = "Clubs";break;
		  case 2: theme = "Diamonds";break;
		  case 3: theme = "Hearts";break;
		  case 4: theme = "Spades";break;
		}
		System.out.println("The card you picked is " + name + " of " + theme);
		// TODO Auto-generated method stub

	}
	
}
