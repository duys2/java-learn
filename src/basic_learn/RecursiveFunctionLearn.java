package basic_learn;

public class RecursiveFunctionLearn {
	public static void main(String[] args) {
		// printHello1();
		// printHello2(0);
		// printHello3(100);
		System.out.println(factorial(5));
		System.out.println(factorial(1));
		System.out.println(factorial(0));
	}

	// 재귀적으로 출력하기
	static void printHello1() {
		/* 너무 많이 출력돼서 오류 발생
		System.out.println("Hello");
		printHello();
		*/
		System.out.println("Hello");
		printHello1();
	}

	// 재귀적으로 출력하기
	static void printHello2(int num) {
		num++;

		// num의 값이 100 미만일 때만 실행
		if (num < 100) {
			System.out.println("Hello");
			printHello2(num); // 재귀 호출: 증가된 num을 인자로 자기 자신을 호출
		}
	}

	// 입력받은 숫자부터 0까지 역순으로 출력하고, 0을 반환
	static int printHello3(int num) {
		// 기저 조건: num이 0일 때 0 반환 (종료)
		if (num == 0) {
			System.out.println(num);
			return 0; // 재귀 종료
		} else { // num이 0이 아닐 때
			System.out.println(num);
			// 재귀 호출: num을 1 감소하여 자기 자신을 호출
			return printHello3(num - 1); // 재귀 호출 결과 반환 최종적으로는 0이 되어 재귀 호출 종료
		}
	}

	// 재귀 호출의 가장 대표적 예시인 팩토리얼
	public static int factorial(int num) { // n!은 1부터 n까지의 정수를 모두 곱한 값
		if (num <= 1) // 0! 1!은 1
			return 1;
		// 결과적으로 factorial(5)는 5*4*3*2*1이 되어 5! == 120이 됨
		return num * factorial(num - 1); // 재귀 호출: num을 1씩 감소하여 자신을 호출
	}
}