package exception_learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try { // 정상 실행
			System.out.print("정수를 입력하세요: ");
			int num = sc.nextInt();
			System.out.println("입력한 정수는 " + num + "입니다.");
		} catch (InputMismatchException e) { // 예외 발생 시 실행
			System.out.println("정수를 입력해 주세요!");
		} finally { // 무조건 실행
			sc.close();
		}
	}
}