package default_method_learn;

public interface MyInterface {
	void myInterfaceAbstractMethod(); // 추상 메서드

	default void defaultMethod() { // 디폴트 메서드 정의
		System.out.println("MyInterface의 디폴트 메서드");
	}
}