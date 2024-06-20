package collection_learn.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableLearn {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, String> hashtable = new Hashtable<>(); // new HashMap<>()로 해도 된다.

		hashtable.put("홍길동", "hgd1443");
		hashtable.put("전우치", "woochi2009");
		hashtable.put("고길동", "swordmaster1983");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요.\n");
			System.out.print("아이디: ");
			String id = scanner.nextLine();

			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			System.out.println();

			if (hashtable.containsKey(id)) { // 키(아이디)가 있으면: 입력한 아이디가 존재하면
				if (hashtable.get(id).equals(password)) { // 키(아이디)에 해당하는 값(비밀번호)이 입력한 비밀번호와 일치하면
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다!\n");
				}
			} else {
				System.out.println("입력한 아이디가 존재하지 않습니다!\n");
			}
		}

		scanner.close();
	}
}