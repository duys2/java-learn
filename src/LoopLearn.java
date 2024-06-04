import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopLearn {
	public static void main(String[] args) {
		/* 반복문(Loop Statement) */

		// // 1. while문
		/* 형식
		while (조건) {
			조건이 참이면 실행하는 코드
		}
		*/

		// // 무한 루프 예시
		// while (true) {
		// 	System.out.println("Hello World");
		// }
		// while (5 > 3) {
		// 	System.out.println("Hello World");
		// }

		// // 1부터 100까지 3 또는 7의 배수 뽑아내기
		// int num = 1;
		//
		// while (num <= 100) {
		// 	if (num % 3 == 0 || num % 7 == 0)
		// 		System.out.println(num);
		// 	num++;
		// }

		// // 1부터 230까지 홀수의 합 구하기
		// int num = 1, total = 0;
		//
		// while (num <= 230) {
		// 	if (num % 2 != 0) total += num;
		// 	num++;
		// }
		//
		// System.out.println("홀수의 합: " + total); // 홀수의 합: 13225

		// // 2. do-while문
		// int num = 17;
		//
		// do {
		// 	System.out.println("num의 값은 " + num); // num의 값은 17
		// } while (num < 10);

		// // 3.for문
		/*
		형식
		for (초기식; 조건식; 증감식) {
			// 조건식이 참이면 실행되는 코드
		}
		*/

		// // 무한 루프
		// for (; ; ) {
		// 	System.out.println("Hello World");
		// }
		// for (double i = 0; i != 10.0; i += 0.1) {
		// 	System.out.println("Hello World!");
		// }
		// // 10번 실행
		// for (int i = 0; i != 10; i += 1) {
		// 	System.out.println("Hello World!");
		// }

		// // 구구단(7단)
		// for(int i = 1; i <= 9; i++) {
		// 	System.out.println("7 x " + i + " = " + (7 * i));
		// }

		// // 팩토리얼
		// int num = 15;
		// long factorial = 1; // 엄청나게 큰값이 나올 수 있기에 long으로
		// for (int i = 1; i <= num; i++) {
		// 	factorial *= i;
		// }
		// System.out.println(num + "!은 " + factorial + "이다."); // 15!은 1307674368000이다.

		// // 피보나치
		// int[] fibonacci = new int[10];
		// fibonacci[0] = 1;
		// fibonacci[1] = 1;
		//
		// for (int i = 2; i < fibonacci.length; i++) {
		// 	fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		// }
		//
		// for (int i = 0; i < fibonacci.length; i++) {
		// 	System.out.print(fibonacci[i] + " "); // 1 1 2 3 5 8 13 21 34 55
		// }

		// // 4. 중첩 반복문
		// // 구구단: 1단부터 9단까지 출력(중첩 반복문)
		// for (int i = 1; i <= 9; i++) {
		// 	for (int j = 1; j <= 9; j++) {
		// 		System.out.println(i + "곱하기 " + j + "은 " + i * j);
		// 	}
		// }

		// // 5. break와 continue
		// // break
		// int num = 20;
		//
		// while (num < 50) {
		// 	num++;
		// 	if (num == 30)
		// 		break; // 30에서 반복문 종료
		// }
		//
		// System.out.println(num);

		// // continue
		// int num = 10;
		//
		// while (num < 50) {
		// 	num++;
		// 	if (num == 30)
		// 		continue; // 30에서 반복 건너뛰기
		// 	System.out.println(num); // 30 제외 전부 출력
		// }

		// 6. 향상된 반복문
		/* 형식
		for (타입 변수명 : 배열 또는 컬렉션(List, ArrayList 등)) {
			실행 코드
		}
		*/

		// // 배열
		// double[] numbers = {10.9, 22.7, 12.2, 6.7};
		// for (double num : numbers)
		// 	System.out.println(num); // 10.9 22.7 12.2 6.7 순차적으로 출력

		// // 컬렉션
		// List<String> list = Arrays.asList("Hello", "World", "Java", "Programming");
		// for (String str : list)
		// 	System.out.println(str); // Hello World Java Programming 순차적으로 출력
	}
}
