package default_method_learn;

// MyInterface, MyNewInterface로 각각 상속 받을 때
// public class MyImplementsClass implements MyInterface, MyNewInterface {
public class MyImplementsClass implements MyImplementsInterface {
	@Override
	public void myInterfaceAbstractMethod() {
		System.out.println("MyInterface의 추상 메서드 구현");
	}

	@Override
	public void myNewInterfaceAbstractMethod() {
		System.out.println("MyNewInterface의 추상 메서드 구현");
	}

	@Override
	public void myImplementsInterfaceAbstractMethod() {
		System.out.println("MyImplementsInterface의 추상 메서드 구현");
	}

	/* MyInterface, MyNewInterface로 각각 상속 받을 때
	@Override
	public void defaultMethod() { // 어떤 디폴트 메서드를 사용할지 명시적으로 지정
		MyNewInterface.super.defaultMethod(); // MyNewInterface의 디폴트 메서드를 사용하겠다.
	}
	*/

	@Override
	public void defaultMethod() { // 어떤 디폴트 메서드를 사용할지 명시적으로 지정
		// MyImplementsInterface에서 지정한 디폴트 메서드를 사용하겠다.
		MyImplementsInterface.super.defaultMethod(); // 결과적으로 MyNewInterface의 디폴트 메서드 사용
	}
}