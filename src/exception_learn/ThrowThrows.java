package exception_learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowThrows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("분모를 입력하세요: ");
			int result = divide(10, sc.nextInt());
			System.out.println("결과: " + result);
		} catch (ArithmeticException e) { // ArithmeticException: 0으로 나눌 때
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
		} finally {
			sc.close();
		}
	}

	public static int divide(int numerator, int denominator) throws ArithmeticException {
		if (denominator == 0)
			throw new ArithmeticException("0으로 나눌 수 없습니다.");

		return numerator / denominator;
	}
}