package practice2021_12_17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class practice2 {

	public static void main(String[] args) throws IOException {
		FileWriter f = null;
		BufferedWriter fl = null;
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
		f = new FileWriter("src\\output.txt");
		fl = new BufferedWriter(f);
		for(student var : students) {
			fl.write(var + " ");
			fl.newLine();
		}
		fl.close();
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