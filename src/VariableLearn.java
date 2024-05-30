public class VariableLearn {
	public static void main(String[] args) {
		// 형식: {타입} 변수명 = 값;

		// int num; // 변수 선언

		// num = 6; // 변수에 값 할당

		// // 선언과 동시에 할당
		// int num2 = 10;
		// double num3;

		// // System.out.println(num3); // 컴파일 오류

		// num = 22; // 재할당

		// int num4, num5; // 동시 선언

		// // 할당
		// num4 = 29;
		// num5 = 55;

		// int num6 = 21, num7 = 97; // 동시에 선언 및 초기화 (잘 안 쓴다)

		// int value1 = 20;
		// int value2 = value1;
		// System.out.println(value1);
		// System.out.println(value2);

		// char c = ' ';

		// // 1. byte
		// byte byteNum = 127;
		// System.out.println(byteNum); // 127 출력
		// byteNum++;
		// System.out.println(byteNum); // -128 출력
		// byte byteNum2 = 213; // 에러 발생

		// // 2. short
		// short shortNum = 32767;
		// System.out.println(shortNum); // 32767 출력
		// shortNum++;
		// System.out.println(shortNum); // -32768 출력

		// // 3. int
		// int intNum = 2147483647;
		// System.out.println(intNum); // 2147483647 출력
		// intNum++;
		// System.out.println(intNum); // -2147483648 출력

		// int num = 13_98;
		// System.out.println(num); // 컴파일러는 _ 무시

		// // 4. long
		// long longNum = 9223372036854775807L;
		// System.out.println(longNum); // 9223372036854775807 출력
		// longNum++;
		// System.out.println(longNum); // -9223372036854775808 출력

		// // 5. char
		// // char 타입 변수 선언과 출력
		// char charVal = 'G';
		// System.out.println(charVal); // 변수 charVal 출력: G
		// System.out.println('G'); // G 출력

		// charVal = 'E'; // 재할당

		// // 유니코드로 변환
		// System.out.println((int) charVal); // 유니코드값: 69 출력
		// System.out.println((int) 'D'); // 유니코드값: 68 출력
		// System.out.println((int) 'd'); // 유니코드값: 100 출력 → 대소문자 구별

		// // char 연산
		// char charVal2 = 'A'; // 65
		// char charVal3 = 'C'; // 67

		// // 각각의 문자 리터럴이 유니코드 값으로 변환되어 연산됨
		// // 결국엔 65 + 67이 되었고, 그렇기에 char는 정수형이다.
		// System.out.println(charVal2 + charVal3); // 132 출력

		// // char 변수와 정수의 연산
		// char charVal4 = 'F'; // 70
		// System.out.println((int) charVal4); // 70 출력
		// System.out.println(charVal4 + 5); // 75 출력
		// System.out.println((char) (charVal4 + 5)); // K 출력

		// // 16진수로 연산
		// char charVal5 = 0x0048;
		// System.out.println((char) 72); // 0x0048을 10진수로 하면 72이다.
		// System.out.println(charVal5);

		// // 10을 여러 진법으로
		// 10
		// 012
		// 0xa
		// 0b1010

		// // 6. float
		// // float floatNum = 3.14; // 에러 발생
		// float floatNum2 = 3.14f; // 리터럴 표현은 숫자 뒤에 f를 붙여야 함

		// System.out.println(floatNum2 * 2.27); // 7.127800238132477

		// // 7. double
		// double doubleNum = 3.14; // f 안 붙여도 됨
		// System.out.println(doubleNum * 3.14); // 9.8596

		// // 8. boolean
		// boolean boolVal = true;

		// System.out.println("참&거짓: " + boolVal);
		// System.out.println("참&거짓: " + !boolVal);

		// // array
		// int[] arr; // 배열의 참조 변수 선언
		// arr = new int[5]; // new 연산자로 크기가 5인 배열 생성 후 참조 변수 arr에 참조

		// double[] arr2 = new double[5]; // 선언과 동시에 생성

		// int size = 5;
		// String[] arr3 = new String[size];

		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr[i]); // 전부 0. 만약 실수형이라면 0.0
		// }
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr3[i]); // 전부 null: 아무것도 참조하지 않고 있다.
		// }

		// int arr4[]; // 이렇게 해도 아래와 같이 배열 참조 변수를 선언하는 것이지만
		// int[] arr5; // 이렇게 하는 게 자료형과 변수를 명확히 구분하기에 이와 같이 쓰자

		// boolean[] arr6 = new boolean[5];
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr6[i]); // 전부 false
		// }

		// String str = "Hello World!";
		// String str2 = new String("Hello World!");

		// System.out.println(str);
		// System.out.println(str2);

		// 자동 형변환
		// int intNum = 170;
		// double doubleNum = intNum; // 자동 형변환: int에서 double로

		// System.out.println(doubleNum);

		// // 명시적 형변환
		// double doubleNum = 23.75;
		// ()안에 있는 자료형으로 형변환한다.
		// int intNum = (int) doubleNum; // 명시적 형변환: double에서 int로

		// System.out.println(intNum); // 23 출력
	}
}