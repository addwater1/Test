package practice2021_11_12;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		Random r = new Random(1000);
		for(int i=0;i<100;i++) {
			System.out.println(r.nextInt(100));
		}

	}

}
