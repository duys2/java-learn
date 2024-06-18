package generic_learn.bounded_type_parameter;

public class BoundedTypeParameter {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		//  Double.compare 메소드는 첫 번째 매개값이 작으면 -1을, 같으면 0을, 크면 1을 리턴
		return Double.compare(v1, v2); // Double.compare()는 실수도 정확히 연산
	}

	public static void main(String[] args) {
		/* 두 래퍼 클래스 Integer와 Double은 모두 Number를 상속 받는다. */
		// 정수만 들어가서 정수화
		int result1 = BoundedTypeParameter.compare(2, 2); // int -> Integer (자동 Boxing)
		System.out.println(result1); // 0

		// 4.5가 들어가서 실수화
		int result2 = compare(4.5, 3); // double -> Double (자동 Boxing)
		System.out.println(result2); // 1

		int result3 = compare(2.5, 2.5); // double -> Double (자동 Boxing)
		System.out.println(result3); // 0
	}
}