public class WrapperClassLearn {
	public static void main(String[] args) {
		/* ---------------- 박싱, 언박싱 ---------------- */
		// 래퍼 클래스 생성: 박싱
		Integer integer = Integer.valueOf(100); // 불필요한 박싱

		System.out.println(integer); // 100

		// 래퍼 클래스 내부의 기본형 값 꺼내기: 언박싱
		int value = integer.intValue(); // 불필요한 언박싱

		System.out.println(value); // 100

		/* ---------------- 오토 박싱, 오토 언박싱 ---------------- */
		// 컴파일러가 자동적으로 valueOf(), 타입Value()를 추가해주는 기능
		Integer autoBoxing = 200; // 오토 박싱

		System.out.println(autoBoxing); // 200

		int autoUnBoxing = autoBoxing; // 오토 언박싱

		System.out.println(autoUnBoxing); // 200

		/* ---------------- 주요 메소드 실습 ---------------- */
		Integer integer1 = Integer.valueOf(10); // Integer integer1 = 10; ← 이렇게 자동 박싱 가능
		Integer integer2 = Integer.valueOf("20"); // 문자열을 래퍼로 박싱
		int stringToInteger = Integer.parseInt("30"); // 문자열을 기본형으로 변환

		// compareTo(): 비교하기(내(. 앞에) 값이 작으면 -1, 같으면 0, 크면 1 반환)
		System.out.println(integer1.compareTo(50)); // -1
		System.out.println(integer2.compareTo(Integer.parseInt("13"))); // 1
		System.out.println(stringToInteger); // 30

		// 번외: 산술연산
		System.out.println("sum(): " + Integer.sum(38, 27)); // 합 반환
		System.out.println("max(): " + Integer.max(38, 27)); // 큰 숫자 반환
		System.out.println("min(): " + Integer.min(38, 27)); // 작은 숫자 반환
	}
}