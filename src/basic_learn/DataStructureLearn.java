package basic_learn;

import java.util.ArrayList;

public class DataStructureLearn {
	public static void main(String[] args) {
		/* ---------------- 접근(Access) ---------------- */
		int[] arr = {13, 27, 11, 36, 56, 21, 24, 9};
		int access = arr[2];
		System.out.println(access); // 11

		/* ---------------- 검색(Search) ---------------- */
		int targetValue = 36;
		int targetIndex = -1; // 못 찾으면 -1

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == targetValue) {
				targetIndex = i;
				break;
			}
		}

		if (targetIndex != -1) {
			System.out.println("찾는값 " + targetValue + "의 index는 " + targetIndex + "입니다.");
		} else {
			System.out.println("찾는값 " + targetValue + "은 배열에 없습니다.");
		}

		/* ---------------- 삽입(Insertion) ---------------- */
		// 크기를 변경할 수 있는 동적 배열 선언
		ArrayList<Integer> arrayList = new ArrayList<>() {{ // 선언과 동시에 초기화
			add(10);
			add(20);
		}};
		// ArrayList<Integer> arrayList = new ArrayList<>(); // 선언만 하기

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " "); // 10 20
		}

		arrayList.add(30); // 배열에 새로운 요소 삽입
		System.out.println();

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " "); // 10 20 30
		}

		/* ---------------- 삭제(Deletion) ---------------- */
		arrayList.remove(0); // 첫 번째 요소 삭제
		System.out.println();

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " "); // 20 30
		}
	}
}