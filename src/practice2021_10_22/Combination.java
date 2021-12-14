package practice2021_10_22;
import java.lang.reflect.Array;
import java.util.*;

public class Combination {

	public static void main(String[] args) {
		int[] list1 = new int[100];
		int[] list2 = new int[100];
		int[] list3 = new int[200];
		System.out.print("Enter list1 size and contents: ");
		list1 = array();
		System.out.print("Enter list2 suze and contents: ");
		list2 = array();
		Arrays.sort(list1);
		Arrays.sort(list2);
		list3 = merge(list1, list2);
		System.out.print("list1 is ");
		display(list1);
		System.out.print("list2 is ");
		display(list2);
		System.out.print("The merged list is ");
		display(list3);
	}
	
	public static int[] merge(int[] list1, int[] list2) {
		int len1 = list1.length;
		int len2 = list2.length;
		int[] list3 = new int[len1+len2];
		int c1 = 0;
		int c2 = 0;
		int i = 0;
		while(c1<len1 && c2<len2) {
			if(list1[c1] < list2[c2]) {
				list3[i] = list1[c1];
				c1++;
			}
			else {
				list3[i] = list2[c2];
				c2++;
			}
			i++;
		}
		if(len2 > c2) {
			while(c2<len2) {
				list3[i] = list2[c2];
				c2++;
				i++;
			}
		}
		else {
			while(c1<len1) {
				list3[i] = list1[c1];
				c1++;
				i++;
			}
		}
		return list3;
	}
	
	public static int[] array() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] list = new int[n];
		for(int i=0; i<n; i++) {
			list[i] = input.nextInt();
		}
		return list;
	}
	
	public static void display(int[] list) {
		int len = list.length;
		for(int i=0; i<len; i++) {
			System.out.printf("%d ",list[i]);
		}
		System.out.printf("\n");
	}

}
