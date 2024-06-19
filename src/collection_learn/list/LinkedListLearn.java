package collection_learn.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListLearn {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("Java");
		list.add("Coffee");
		list.add("Spring");
		list.add("C++");
		list.remove(2);

		for (String str : list) {
			System.out.println(str); // 출력: Java, Coffee, C++
		}
	}
}