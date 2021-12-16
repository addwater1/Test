package practice2021_11_12;

import java.util.Date;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(1000);
		int n = 100000;
		int t;
		int[] a = new int[n];
		int i,j,k;
		System.out.println(System.currentTimeMillis());
		for(i = 0;i<n;i++) {
			a[i] = random.nextInt();
		}
		for(i = 0; i<n-1;i++) {
			k = i;
			for(j = i+1;j<n;j++) {
				if(a[k]>a[j]) {
					k = j;
				}
			}
			t = a[k];
		    a[k] = a[i];
		    a[i] = t;
		}
		System.out.println(System.currentTimeMillis());
	}

}
