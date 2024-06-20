package collection_learn.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearn {
	public static void main(String[] args) {
		// 1. Map 컬렉션 생성
		Map<String, Integer> hashMap = new HashMap<>();

		hashMap.put("홍길동", 30);
		hashMap.put("전우치", 25);
		hashMap.put("고길동", 40);
		hashMap.put("고길동", 60); // 키가 같으면 마지막 값으로 엎어쓴다.
		hashMap.put("김흥국", 50);
		hashMap.put("김준구", 20);
		hashMap.put("박태환", 35);

		System.out.println("총 Entry 수: " + hashMap.size()); // 저장된 총 Entry 수 얻기

		System.out.println();

		// 2. 객체 찾기
		System.out.println("홍길동: " + hashMap.get("홍길동"));
		System.out.println("전우치: " + hashMap.get("전우치"));

		System.out.println();

		// 3. 모든 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet(); // Map.EntrySet 얻기

		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}

		System.out.println();

		// 4. 모든 Map.Entry 삭제
		hashMap.clear();
		System.out.println("총 Entry 수: " + hashMap.size()); // 0

		System.out.println();

		// 5. 객체 추가 후 Entry 수 출력
		hashMap.put("고길동", 40);
		System.out.println("총 Entry 수: " + hashMap.size()); // 1
	}
}