package practice2021_12_17;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class practice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<student> students = new ArrayList<>();
		String s;
		String[] temp;
		System.out.println("name id age");
		System.out.println("-----------");
		for(;;) {
			s = input.nextLine();
			temp = s.split(" ");
			if(temp[0].equals("exit"))
				break;
			students.add(new student(temp[0],temp[1],temp[2]));
		}
		Collections.sort(students,(s1,s2)->(s1.getAge()-s2.getAge()));
		for (student var : students) {
			System.out.println(var);
		}
	}

}
class student{
	private String id;
	private String name;
	private String age;
	public student(String a,String b,String c) {
		this.id = a;
		this.name = b;
		this.age = c;
	}
	public String toString () {
		return id + ',' + name + ',' + age;
	}
	public int getAge() {
		return Integer.parseInt(this.age);
	}
}