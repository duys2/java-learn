public class ConditionalLearn {
	public static void main(String[] args) {
		/* 조건문(Conditional Statement) */

		// 1. if문
		/*형식
		if (조건1) {
			조건1이 참이면 실행할 코드
		} else if (조건2) {
			조건1이 거짓이고 조건2가 참이면 실행할 코드
		} else {
			모든 조건이 거짓이면 실행할 코드
		}
		*/

		// // 홀수 짝수 판별
		// int num = 115;
		//
		// if (num % 2 == 0)
		// 	System.out.println(num + "은 짝수입니다.");
		// else
		// 	System.out.println(num + "은 홀수입니다.");

		// // 숫자 크기 비교
		// int num1 = 22;
		// int num2 = 17;
		//
		// if (num1 > num2) {
		// 	System.out.println("num1이 더 큽니다.");
		// } else if (num1 < num2) {
		// 	System.out.println("num2가 더 큽니다.");
		// } else {
		// 	System.out.println("둘은 같은 수입니다.");
		// }

		// // 학점 출력
		// int score = 88; // 실점
		//
		// if (score >= 95) {
		// 	System.out.println("A+");
		// } else if (score >= 90) {
		// 	System.out.println("A");
		// } else if (score >= 85) {
		// 	System.out.println("B+");
		// } else if (score >= 80) {
		// 	System.out.println("B");
		// } else if (score >= 75) {
		// 	System.out.println("C+");
		// } else if (score >= 70) {
		// 	System.out.println("C");
		// } else if (score >= 65) {
		// 	System.out.println("D+");
		// } else if (score >= 60) {
		// 	System.out.println("D");
		// } else {
		// 	System.out.println("F");
		// }

		// // 2. 논리연산자
		// int num1 = 13;
		// int num2 = 25;
		// int num3 = 6;
		//
		// boolean result = (num1 > num2) || (num1 < num3) && (num2 < num3);
		//
		// System.out.println(result); // false

		// 3. switch문
		/*형식
		switch(변수) {
			case 값1:
				처리문장1;
				break;
			case 값2:
				처리문장2;
				break;
			default:
				처리문장;
				break;
		}
		*/

		// // 정수
		// int num = 5;
		//
		// switch (num) {
		// 	case 5:
		// 		System.out.println("Yes");
		// 		break;
		// 	case 6:
		// 		System.out.println("No");
		// 		break;
		// }

		// // 정수 수식
		// int num = 7;
		//
		// switch (num - 4) {
		// 	case 0:
		// 		System.out.println("No");
		// 		break;
		// 	case 3:
		// 		System.out.println("Yes");
		// }

		// // 문자열
		// String str = "Java";
		//
		// switch (str) {
		// 	case "Java":
		// 		System.out.println("Yes");
		// 		break;
		// 	case "Python":
		// 		System.out.println("No");
		// 		break;
		// }

		// // 몇월인지 출력하기
		// int monthNumber = 6;
		//
		// switch (monthNumber) {
		// 	case 1:
		// 		System.out.println("january");
		// 		break;
		// 	case 2:
		// 		System.out.println("february");
		// 		break;
		// 	case 3:
		// 		System.out.println("march");
		// 		break;
		// 	case 4:
		// 		System.out.println("april");
		// 		break;
		// 	case 5:
		// 		System.out.println("may");
		// 		break;
		// 	case 6:
		// 		System.out.println("june");
		// 		break;
		// 	case 7:
		// 		System.out.println("july");
		// 		break;
		// 	case 8:
		// 		System.out.println("august");
		// 		break;
		// 	case 9:
		// 		System.out.println("september");
		// 		break;
		// 	case 10:
		// 		System.out.println("october");
		// 		break;
		// 	case 11:
		// 		System.out.println("november");
		// 		break;
		// 	case 12:
		// 		System.out.println("december");
		// 		break;
		// 	default:
		// 		System.out.println("없는 달입니다!");
		// 		break;
		// }
	}
}