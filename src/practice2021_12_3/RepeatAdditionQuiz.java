package practice2021_12_3;
import java.util.ArrayList;
import java.util.Scanner;
public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		ArrayList<Integer> re = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + n1 + " + " + n2 + "? ");
		int ans = input.nextInt();
		while(n1 + n2 != ans) {
			if(re.contains(ans))
				System.out.println("You already entered " + ans);
			else
				re.add(ans);
			System.out.print("Wrong answer. Try again. What is " + n1 + " + " + n2 + "? ");
			ans = input.nextInt();
		}
		System.out.println("You got it!");
	}
}
