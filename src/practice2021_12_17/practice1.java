package practice2021_12_17;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class practice1 {

	public static void main(String[] args) {
		LinkedList<book> list = new LinkedList<book>();
		book b1 = new book("pride and prejudice", "xxx", "xxx", 24);
		book b2 = new book("garden of sinner", "xxx", "xxx", 76);
		book b3 = new book("build great sentences", "xxx", "xxx", 97);
		book b4 = new book("vector calculus", "xxx", "xxx", 50);
		list.addFirst(b1);
		list.addFirst(b2);
		list.addFirst(b3);
		list.addFirst(b4);
		for(book b : list) {
			System.out.println(b.id + b.title + b.publish + b.price);
		}
		
		Map<String, book> hashMap = new HashMap<>();
		hashMap.put(b1.id, b1);
		hashMap.put(b2.id, b2);
		hashMap.put(b3.id, b3);
		hashMap.put(b4.id, b4);
		Map<String, book> treeMap = new TreeMap<>(hashMap);
		treeMap.forEach((a,b)->System.out.println(a));
	}

}
class book{
	String id;
	String title;
	String publish;
	int price;
	book(String a,String b,String c,int d){
		this.id = a;
		this.title = b;
		this.publish = c;
		this.price = d;
	}
}