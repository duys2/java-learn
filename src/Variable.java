import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Variable {
	public static void main(String[] args) {
		// 형식: {타입} 변수명 = 값;

		// int num; // 변수 선언
		//
		// num = 6; // 변수에 값 할당
		//
		// // 선언과 동시에 할당
		// int num2 = 10;
		// double num3 = 0.78;
		//
		// System.out.println(num); // 출력
		//
		// num = 22; // 재할당
		//
		// System.out.println(num); // 출력
		// System.out.println(num2); // 출력
		// System.out.println(num3); // 출력
		//
		// // 실습: 변수 3개를 만들어 합이 100이 되게 출력하기
		// int number1, number2, number3;
		//
		// number1 = 25;
		// number2 = 30;
		// number3 = 45;
		//
		// System.out.println(number1 + number2 + number3);

		// // 정수형
		// int num1 = 1;
		// byte num2 = 2;
		// long num3 = 3;
		// short num4 = 4;
		//
		// // 실수형
		// float num5 = 5.25f;
		// double num6 = 6.8;

		// // 문자형
		// char ch = 'c';
		//
		// // 논리형 (불리언)
		// boolean isTrue = true;
		// boolean isFalse = false;
		//
		// // 문자열 (클래스)
		// String string = "it's string";
		// System.out.println(string.length());

		// int intTest = 2345678902; // 표현할 수 있는 값의 범위 초과

		// // 원시타입
		// int a = 1;
		// int v = a;
		//
		// System.out.println(a);
		// System.out.println(v);

		// char c1 = 'A';
		// char c2 = 65;
		// char c3 = '\u0041';
		// char c4 = '가';
		// char c5 = 44032;
		// char c6 = '\uac00';
		//
		// int uniCode = c1;
		//
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c3);
		// System.out.println(c4);
		// System.out.println(c5);
		// System.out.println(c6);

		// System.out.println(uniCode);

		// short sVal = 10;
		// short result = (short) (sVal + 10); // 형변환: 계산 결과로 int 형으로 바뀌기에 결과값을 형변환을 통해 short 형으로 바꿈
		// System.out.println(result);

		// int num = (int) (10 + 11.4);
		// System.out.println(num);

		// float myFloat = 9.75f;
		// float anotherFloat = myFloat * 2;
		//
		// System.out.println("Original float value: " + myFloat);
		// System.out.println("Calculated float value: " + anotherFloat);
		//
		// System.out.println("Original float value: " + (int) myFloat);
		// System.out.println("Calculated float value: " + (byte) anotherFloat);

		// boolean isTrue = true;
		//
		// if (isTrue) {
		//   System.out.println("이건 트루입니다.");
		// } else {
		//   System.out.println("이건 펄스입니다.");
		// }
		//
		// if (!isTrue) { // !: 부정연산자(반전)
		//   System.out.println("이건 트루입니다.");
		// } else {
		//   System.out.println("이건 펄스입니다.");
		// }

		// int[] arr = {1, 2, 3, 4, 5}; // 개수가 고정되어서 확장성이 떨어짐
		// int[] arr2 = new int[5]; // 전부 0으로 초기화
		// String name = "kil dong";
		// String name2 = new String("kil dong");
		// String[] arr = new String[3];

		// System.out.println(arr2[1]); // 참조 타입
		// System.out.println(name);
		// System.out.println(name2.equals(name)); // 같은지 true false 로 반환

		// List<Integer> list = Arrays.asList(1, 3, 5);
		// System.out.println(list.get(1));
	}
}