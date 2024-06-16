package exception_learn.quiz1;

/*
1. 사용자로부터 이름과 나이를 입력받아 Person 객체를 생성하는 프로그램을 작성하세요.
이때, 나이가 음수이면 InvalidAgeException(사용자 정의 예외)을 발생시키고 적절한 메시지를 출력하세요.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("당신의 이름을 입력하세요: ");
			String name = scanner.nextLine();

			System.out.print("당신의 나이를 입력하세요: ");
			int age = scanner.nextInt();

			System.out.print("입력한 당신의 이름은  " + name + "이고, 나이는 " + invalidAge(age) + "세입니다.");
		} catch (InvalidAgeException e) { // 나이가 음수일 때 예외 처리
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) { // 잘못된 입력 예외 처리
			System.out.println("정확한 값을 입력헤 주세요.");
		} finally { // 예외 유무와 관계 없어도 이직 가능
			scanner.close();
		}
	}

	private static int invalidAge(int age) throws InvalidAgeException {
		if (age < 0) { // 에외 발생
			throw new InvalidAgeException("나이는 음수가 될 수 없습니다.");
		}

		return age;
	}
}