package default_method_learn;

public interface MyImplementsInterface extends MyInterface, MyNewInterface {
	void myImplementsInterfaceAbstractMethod();

	@Override
	default void defaultMethod() { // 어떤 디폴트 메서드를 사용할지 명시적으로 지정
		MyNewInterface.super.defaultMethod();
	}
}