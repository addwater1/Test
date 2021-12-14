package practice2021_10_22;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		double[] list = new double[10];
		list = array();
		list = sort(list);
		display(list);
		// TODO Auto-generated method stub

	}
	
	public static double[] array() {
		Scanner input = new Scanner(System.in);
		double[] list = new double[10];
		for(int i=0; i<10; i++) {
			list[i] = input.nextDouble();
		}
		return list;
	}
	
	public static double[] sort(double[] list) {
		int i;
		int j;
	    double t;
		for(i=0; i<9; i++) {
			for(j=i; j<9; j++) {
				if(list[j] > list[j+1]) {
					t = list[j];
					list[j] = list[j+1];
					list[j+1] = t;
				}
			}
		}
		return list;
	}
	
	public static void display(double[] list) {
		int i;
		int len = list.length;
		for(i=0; i<len; i++) {
			System.out.printf("%f ",list[i]);
		}
	}

}
