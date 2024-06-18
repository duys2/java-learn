package generic_learn.generic_method;

public class GenericMethodTest {
	public static void main(String[] args) {
		GenericClass<String> genericClassString = GenericMethod.test1("Test");
		GenericClass<Integer> genericClassInteger = GenericMethod.test1(990);
		GenericClass<Double> genericClassDouble = GenericMethod.test1(44.2);

		/* 각자의 주소가 출력됨 */
		System.out.println(genericClassString);
		System.out.println(genericClassInteger);
		System.out.println(genericClassDouble);

		// 리턴타입 String
		String string = GenericMethod.test2(224); // 224 출력
		System.out.println(string);

		// 리턴타입이 void: 반환하지 않으므로 메서드명으로만 호출
		GenericMethod.voidTest(10); // 매개값으로 넣어준 10이 출력됨
	}
}