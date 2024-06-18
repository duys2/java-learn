package generic_learn.generic_method;

public class GenericMethod {
	// 리턴타입 GenericClass<T>
	public static <T> GenericClass<T> test1(T t) {
		return new GenericClass<T>();
	}

	// 리턴타입 String
	public static <T> String test2(T t) {
		return t.toString();
	}

	// 리턴타입 없음
	public static <T> void voidTest(T t) {
		System.out.println(t);
	}
}