package collection_learn.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetLearn {
	public static void main(String[] args) {
		// String 객체를 저장하는 HashSet 생성
		Set<String> set = new HashSet<String>();

		// HashSet에 문자열 객체 추가
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("C#");

		Iterator<String> iterator = set.iterator(); // 반복자 생성

		// 가져올 객체가 있는 동안 반복: hasNext()는 가져올 객체가 있으면 true 반환
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // next()는 객체 가져오기
		}

		// foreach 문을 사용해도 된다
		for (String s : set) {
			System.out.println(s);
		}

		set.remove("C++"); // 객체 삭제

		// next()하면 반복자가 비게(?) 되므로 다시 할당 후 출력
		iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // next()는 객체 가져오기
		}

		// Person 객체를 저장하는 HashSet 생성
		Set<Person> peopleSet = new HashSet<>();

		// 추가
		peopleSet.add(new Person("홍길동", 30));
		// 객체를 저장하기 전에 비교를 하기에 중복 저장되지 않는다.
		peopleSet.add(new Person("홍길동", 30));
		peopleSet.add(new Person("전우치", 35));

		// Set은 중복 저장 불가
		System.out.println("인원 수: " + peopleSet.size()); // 인원 수: 2

		for (Person person : peopleSet) {
			System.out.println(person.getName() + "은 " + person.getAge() + "살입니다.");
		}
	}
}