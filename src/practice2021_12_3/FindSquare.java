package practice2021_12_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int num = input.nextInt();
		int product = 1;
		ArrayList<Integer> lst;
		lst = yins(num);
		for(int i = 0;i < lst.size();i++) {
			if(i>0 && lst.get(i)!=lst.get(i-1) && Collections.frequency(lst, lst.get(i))%2 == 1)
				product *= lst.get(i);
			else if(i == 0 && Collections.frequency(lst, lst.get(i))%2 == 1)
				product *= lst.get(i);
		}
		System.out.println(product);
		System.out.println(product*num);
		System.out.println(String.valueOf(yins(num)));
	}
	
	public static ArrayList<Integer> yins(int num){
		ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (num % i != 0) {
                continue;
            }else{
               if(num >= 2){
            	   list.add(i);
                   num = num / i;
                   i = 1;
               }
            }
        }
        return list;
    }
	
}
