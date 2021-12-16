package practice2021_10_15;

public class CreateLotteryGame {

	public static void main(String[] args) {
		int num;
		for(;;) {
			num = (int)(Math.random()*90+10);
			System.out.println(num);
			if(num/10 != num%10) {
				break;
			}
		}
		
		// TODO Auto-generated method stub

	}

}
