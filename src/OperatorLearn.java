public class OperatorLearn {
	public static void main(String[] args) {
		/* ---------------- 단항 연산자 ---------------- */

		// 1. 부호 연산자 (+, -)
		int num = 100;

		System.out.println(100); // 100
		System.out.println(num); // 100
		System.out.println(+num); // 양의 부호 연산자로 명시: 100
		System.out.println(-num); // 음의 부호 연산자로 부호 반전: -100
		System.out.println(-(-num)); // 음의 부호 연산자로 다시 부호 반전: 100

		// 2. 증감 연산자 (++, --)
		int num2 = 10;
		int num3 = 20;
		int num4 = 50;
		int num5 = 65;

		System.out.println(++num2); // 11: 증가 후 출력
		System.out.println(--num3); // 19: 감소 후 출력
		System.out.println(num4++); // 50: 출력 후 증가
		System.out.println(num5--); // 65: 출력 후 감소
		System.out.println(num4); // 51
		System.out.println(num5); // 64

		// 3. 논리 부정 연산자
		boolean isHungry = true;

		if (isHungry) {
			System.out.println("배가 고프다.");
		}

		if (!isHungry) {
			System.out.println("배가 부르다.");
		}

		System.out.println(isHungry); // true
		System.out.println(!isHungry); // false
	}
}