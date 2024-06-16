package exception_learn;

import java.util.Scanner;

public class CustomExceptionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("나눌 숫자를 입력하세요: ");
			int denominator = sc.nextInt();

			System.out.println(divide(5, denominator));
		} catch (MyCustomException myCustomException) {
			System.out.println(myCustomException.getMessage());
		} finally {
			sc.close();
		}
	}

	public static int divide(int numerator, int denominator) throws MyCustomException {
		if (denominator == 0) {
			throw new MyCustomException("0은 분모에 들어갈 수 없습니다.");
		}

		return numerator / denominator;
	}
}