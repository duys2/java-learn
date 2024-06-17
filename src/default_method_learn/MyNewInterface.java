package default_method_learn;

public interface MyNewInterface {
	void myNewInterfaceAbstractMethod();

	default void defaultMethod() { // 디폴트 메서드 정의
		System.out.println("MyNewInterface의 디폴트 메서드");
	}
}