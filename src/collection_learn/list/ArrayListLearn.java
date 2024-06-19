package collection_learn.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearn {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>(30); // 초기 크기 지정

		list.add(1); // add(element): 데이터 삽입
		list.add(2);
		list.add(3);
		list.add(0, 13); // add(index, element): 특정 인덱스에 삽입
		list.set(0, -10); // set(index, element): 특정 인덱스의 값 수정
		list.remove(2); // remove(index): 특정 인덱스의 데이터 삭제
		System.out.println(list.size()); // size(): 크기 반환
		System.out.println(list.get(0)); // get(index): 특정 인덱스의 값 반환

		for (Integer i : list) {
			System.out.println(i); // 출력: -10, 1, 3
		}

		System.out.println(list.indexOf(3)); // indexOf(Object): 저장된 위치 반환(단, 첫 번째 데이터의 위치만 반환)
		System.out.println(list.lastIndexOf(3)); // 역순으로 검색
	}
}