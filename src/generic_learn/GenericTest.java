package generic_learn;

import java.util.List;
import java.util.ArrayList;

public class GenericTest {
	public static void main(String[] args) {
		// <> 안에 들어오는 게 제네릭
		List<Integer> list = new ArrayList<>();

		list.add(1);
		// 강한 타입 체크
		// list.add(2.2); // 컴파일 에러 발생: 정수형 외 저장 불가

		System.out.println(list.get(0));

		/* 타입 변환: 제네릭을 사용하지 않으면 타입 변환을 해줘야 한다. */
		List<Object> list2 = new ArrayList<>();

		list2.add(1);
		list2.add("Hello World!");

		// 제네릭을 사용하면 아래와 같은 타입 변환을 제거할 수 있다(안 해도 된다).
		int num = (int)list2.get(0);
		String string = (String)list2.get(1);
	}
}