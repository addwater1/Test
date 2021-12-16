package practice2021_11_12;
import java.util.Random;
public class TestStopWatch {

	public static void main(String[] args) {
		Random random = new Random(1000);
		int n = 100000;
		int t;
		int[] a = new int[n];
		int i,j,k;
		StopWatch s1 = new StopWatch();
		
		s1.start();
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
		s1.end();
		System.out.println(s1.getElapsedTime());
	}

}
