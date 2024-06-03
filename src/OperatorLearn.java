public class OperatorLearn {
	public static void main(String[] args) {
		/* ---------------- 단항 연산자 ---------------- */

		// // 1. 부호 연산자 (+, -)
		// int num = 100;
		//
		// System.out.println(100); // 100
		// System.out.println(num); // 100
		// System.out.println(+num); // 양의 부호 연산자로 명시: 100
		// System.out.println(-num); // 음의 부호 연산자로 부호 반전: -100
		// System.out.println(-(-num)); // 음의 부호 연산자로 다시 부호 반전: 100
		//
		// // 2. 증감 연산자 (++, --)
		// int num2 = 10;
		// int num3 = 20;
		// int num4 = 50;
		// int num5 = 65;
		//
		// System.out.println(++num2); // 11: 증가 후 출력
		// System.out.println(--num3); // 19: 감소 후 출력
		// System.out.println(num4++); // 50: 출력 후 증가
		// System.out.println(num5--); // 65: 출력 후 감소
		// System.out.println(num4); // 51
		// System.out.println(num5); // 64
		//
		// // 3. 논리 부정 연산자
		// boolean isHungry = true;
		//
		// if (isHungry) {
		// 	System.out.println("배가 고프다.");
		// }
		//
		// if (!isHungry) {
		// 	System.out.println("배가 부르다.");
		// }
		//
		// System.out.println(isHungry); // true
		// System.out.println(!isHungry); // false

		/* ---------------- 이항 연산자 ---------------- */

		// // 1. 산술 연산자
		// int num = 23, num2 = 11; // 변수 정의
		//
		// System.out.println(num + num2); // 덧셈: 34
		// System.out.println(num - num2); // 뺄셈: 12
		// System.out.println(num * num2); // 곱셈: 253
		// System.out.println(num / num2); // 나눗셈: 2
		// System.out.println(num % num2); // 나머지: 1

		// // 2. 문자열 연결 연산자
		// System.out.println("Hello Java " + "World!"); // 문자열끼리 연산: Hello Java World!
		// System.out.println("The number is " + 72 + 70); // 문자열과 숫자 연산: The number is 7270
		// System.out.println(19 + 11 + " number"); // 숫자와 문자열 연산: 30 number

		// // 3. 비교 연산자
		// 크기 비교
		// System.out.println(10 > 21); // false
		// System.out.println(22 >= 22); // true
		// System.out.println(51 < 4); // false
		// System.out.println(45 <= 54); // true

		// // 동등 비교
		// System.out.println(27 != 'B'); // true: char 타입도 정수형으로 연산된다.
		// System.out.println((float)0.1 == 0.1f);  // true: 부동소수점형은 float를 사용하거나
		// System.out.println((byte)(0.1 * 10) == (int)(0.1f * 10));  // true: 정수형으로 형변환 해야 한다.

		// // 문자열의 비교 연산
		// String str1 = "Hello World";
		// String str2 = "Hello World";
		// // new 키워드로 생성하면 힙 영역 상에서 다른 주소에 생성됨
		// String newStr = new String("Hello World");
		//
		// System.out.println(str1 == str2); // true: 문자열 자체가 동일하면 같은 객체를 가리킴
		// System.out.println(str1==newStr); // false: 참조값이 다르기 때문에 다른 결과가 나옴
		// System.out.println(str1.equals(newStr)); // true: 문자열간 비교 연산은 equals() 사용

		// // 4. 논리 연산자
		// System.out.println(true && true); // true
		// System.out.println(true && false); // false
		// System.out.println(true || false); // true
		// System.out.println(true ^ false); // true
		// System.out.println(true && !false); // true: false가 반전되어 true가 되므로 조건식은 true && true가 됨

		// // 5. 비트 연산자
		// // 비트 논리 연산
		// System.out.println(0b110 & 0b101); // 0b100 == 4
		// System.out.println(0b110010|0b101); // 0b110111 == 55: 0b101이 0b000101처럼 연산됨
		// System.out.println(0b1100^0b0001); // 0b1101 == 13
		// System.out.println(~0b01011); // -12: 비트 뒤집고, 2의 보수까지 취함
		// System.out.println(0b1); // 1
		// System.out.println(~0b1); // -2: 마찬가지

		// // 비트 이동 연산
		// System.out.println(10 << 2); // 00001010 → 00101000: 40
		// // 최상위 부호가 0이므로 0으로 채움
		// System.out.println(10 >> 1); // 00001010 → 00000101: 5
		// // >>>는 전부 0으로 채움
		// System.out.println(10 >>> 3); // 00001010 → 00000001: 1
		// System.out.println(-10 >>> 2); // 음수는 최상위 부호 비트가 1이다. 그러므로 양수로 변환된다.

		/* ---------------- 삼항 연산자 ---------------- */

		// // 삼항 연산자
		// int age = 23;
		//
		// if (age > 19) {
		// 	System.out.println("성인입니다.");
		// } else if (age > 7) {
		// 	System.out.println("학생입니다.");
		// } else {
		// 	System.out.println("유아입니다.");
		// }
		//
		// // if-else를 삼항 연산자로
		// System.out.println((age > 19) ? "성인입니다." : ((age>7) ? "학생입니다." : "유아입니다."));

	}
}