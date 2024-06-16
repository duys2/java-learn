package exception_learn.quiz2;

/*
사용자로부터 문자열을 입력받아 정수로 변환하는 프로그램을 작성하세요.
이때, 입력된 문자열이 정수로 변환될 수 없는 경우 NumberFormatException을 처리하여 적절한 메시지를 출력하세요.
Tip: Integer.parseInt(str); // 문자열을 정수로 변환
*/

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("숫자로 바꿀 문자열을 입력해 주세요: ");
			String stringNum = scanner.nextLine();
			System.out.print("변환한 숫자는 " + Integer.parseInt(stringNum) + "입니다.");
		} catch (NumberFormatException e) { // 나이가 음수일 때 예외 처리
			System.out.println("정확한 값을 입력해 주세요.");
		} finally { // 예외 유무와 관계 없이 실행
			scanner.close();
		}
	}
}