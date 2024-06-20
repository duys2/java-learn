package basic_learn;

public class StringLearn {
	public static void main(String[] args) {
		// // 문자열의 선언과 초기화
		// String str; // 문자열 선언
		// str = "Hello World"; // 변수에 할당
		// String str2 = "Hello World"; // 선언과 동시에 할당
		// String str3 = new String("Hello World"); // new 키워드 사용

		// // 1. equals(): 두 문자열이 같은지 비교 후 부울값 리턴
		// // 형식: equals(비교할 문자열);
		// String str1 = "Welcome to Java";
		// String str2 = "Nice to meet you";
		// String str3 = "Welcome to Java";
		//
		// System.out.println(str1.equals(str2)); // false
		// System.out.println(str1.equals(str3)); // true

		// // 2. indexOF(): 특정 문자열이 시작하는 위치 (인덱스)리턴
		// // 형식: indexOf(찾을 문자열);
		// String str = "This is a string";
		//
		// System.out.println(str.indexOf("hi")); // 1
		// System.out.println(str.indexOf("i")); // 2: 여러개가 겹치면 첫 번째 인덱스 반환
		// System.out.println(str.indexOf("a")); // 8

		// // 3. contains(): 특정 문자열의 포함 여부를 부울값으로 리턴
		// // 형식: contains(확인할 문자열);
		// String str = "Hello Java World!";
		// System.out.println(str.contains("Java")); // true

		// // 4. charAt(): 문자열에서 특정 위치의 문자 리턴
		// // 형식: charAt(확인할 인덱스);
		// String str = "My Name is Java";
		// System.out.println(str.charAt(7)); // 공백
		// System.out.println(str.charAt(9)); // s

		// // 5. replace(): 문자열에서 특정 문자열을 다른 문자열로 바꾸어 반환
		// // 형식: replace(대상 문자열, 바꿀 문자열);
		// String str = "Hello World";
		// System.out.println(str.replace("World", "Java")); // Hello Java

		// // 6. replaceAll(): 인자로 정규식 (regex)을 받아서 해당 형태로 문자열을 변경
		// // 형식: replaceAll(정규식, 문자열);
		// String str = "Hello World!";
		// System.out.println(str.replaceAll("World", "Java")); // Hello Java!
		// // 정규식에서 . 는 모든 문자를 의미
		// System.out.println(str.replaceAll(".", "Java"));  // JavaJavaJavaJavaJavaJavaJavaJavaJavaJavaJavaJava

		// // 7. substring(): 문자열에서 특정 문자열을 뽑아내 반환
		// // 형식: substring(시작 위치, 끝 위치);
		// String str = "Hello Java";
		// // ※ 끝 인덱스는 포함 안 되고 앞까지 실행
		// System.out.println(str.substring(1, 4)); // ell

		// // 8. toUpperCase(): 모두 대문자로
		// // 형식: toUpperCase();
		// String str = "hello world";
		// System.out.println(str.toUpperCase()); // HELLO WORLD

		// // 9. toLowerCase(): 모두 소문자로
		// // 형식: toLowerCase();
		// String str = "HELLO WORLD";
		// System.out.println(str.toLowerCase());

		// // 10. split(): 지정한 구분자를 기준으로 잘라서 배열로 반환
		// // 형식: split(구분자);
		// String str = "Hello World";
		// String[] ls = str.split("l"); // ["He", "", "o Wor", "d"]
		// System.out.println(ls.length);
		// for (int i = 0; i < ls.length; i++) {
		// 	System.out.println(ls[i]);
		// }

		// // 11. concat(): 주어진 문자열을 현재의 문자열 뒤에 붙여 반환
		// // 형식: concat(합칠 문자열);
		// String str = "Hello Wo";
		// String mergeStr = "rld!";
		//
		// System.out.println(str.concat(mergeStr)); // Hello World!

		// // 12. length(): 문자열의 길이 반환
		// // 형식: length();
		// String str = "Java Spring";
		// System.out.println(str.length()); // 11

		// // 13. valueOf(): 다양한 데이터 타입을 문자열로 변환
		// // 형식: valueOf(변환할 값);
		// System.out.println(String.valueOf(123791)); // 123791
		// System.out.println(String.valueOf('T')); // T
		// System.out.println(String.valueOf(7.45)); // 7.45
		// char[] arr = {'J', 'a', 'v', 'a'};
		// System.out.println(String.valueOf(arr)); // Java
		// String str = "Hello World";
		// System.out.println(str.valueOf(32));

		// // 14. trim(): 문자열 양 끝의 공백 제거
		// // 형식: trim();
		// String str = "Hello World ";
		// String str2 = " Hello Java ";
		// System.out.println(str); // "Hello World "
		// System.out.println(str2); // " Hello Java "
		// System.out.println(str.trim()); // "Hello World"
		// System.out.println(str2.trim()); // "Hello Java"

		// // 15. format(): 포맷팅 메소드
		// // 형식: String.format("... %s.. %s..", 치환값1, 치환값2);
		// String name = "홍길동";
		// System.out.println(
		// 	String.format("저의 이름은 %s이고, 나이는 %s세이며, 취미는 %s입니다.", name, 38, "축구")); // 저의 이름은 홍길동이고, 나이는 38세이며, 취미는 축구입니다.

		// // 16. StringBuffer와 StringBuilder
		// // 메소드 형식들: append(문자열); insert(인덱스, 문자열); substring(시작 인덱스, 끝 인덱스);
		// StringBuffer stringBuffer = new StringBuffer();
		// stringBuffer.append("Hello World!");
		// stringBuffer.append(" 오늘 날씨가 좋네요.");
		// System.out.println(stringBuffer); // Hello World! 오늘 날씨가 좋네요.
		// stringBuffer.insert(6, "Java ");
		// System.out.println(stringBuffer); // Hello Java World! 오늘 날씨가 좋네요.
		// System.out.println(stringBuffer.substring(6, 10)); // Java
	}
}