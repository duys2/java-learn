package collection_learn.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLearn {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("홍길동", 30); // 객체 추가
		int v = map.get("홍길동"); // 객체 찾기: 키에 해당하는 값 리턴
		map.remove("홍길동"); // 객체 삭제: 키에 해당하는 객체 삭제
		System.out.println("키 홍길동의 값은 " + v);

		map.put("홍길동", 30);
		map.put("전우치", 34);
		map.put("고길동", 46);
		map.put("김흥국", 57);
		map.put("김준구", 25);
		map.put("박태환", 29);

		// 1. keySet() 메서드로 모든 키를 Set 컬렉션으로 얻은 다음, 반복자를 통해 키를 하나씩 얻고 get() 메서드를 통해 값 가져오기
		System.out.println("===1번===");
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = String.valueOf(keyIterator.next());
			int value = map.get(key);
			System.out.println(key + ": " + value);
		}

		System.out.println();

		// 2. entrySet() 메서드로 모든 Map.Entry를 Set 컬렉션으로 얻은 다음, 반복자를 통해 Map.Entry를 하나씩 얻고 getKey()와 getValue() 메서드를 이용해 키와 값 가져오기
		System.out.println("===2번===");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();

		for (Map.Entry<String, Integer> entry : entries) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}
}