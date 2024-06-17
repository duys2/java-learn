package default_method_learn;

public class DefaultMathodTest {
	public static void main(String[] args) {
		MyImplementsClass myimplementsClass = new MyImplementsClass();
		// myimplementsClass.abstractMethod(); // 추상 메서드 구현
		// myimplementsClass.defaultMethod(); // 오버라이드 전: 디폴트 메서드
		// myimplementsClass.defaultMethod(); // 오버라이드 후: 디폴트 메서드 오버라이드
		// myimplementsClass.defaultMethod(); // 구현 클래스에서 명시적 지정: MyNewInterface의 디폴트 메서드

		/* 인터페이스 상속 후 메서드 호출 */
		myimplementsClass.myInterfaceAbstractMethod(); // MyInterface의 추상 메서드 구현
		myimplementsClass.myNewInterfaceAbstractMethod(); // MyNewInterface의 추상 메서드 구현
		myimplementsClass.myImplementsInterfaceAbstractMethod(); // MyImplementsInterface의 추상 메서드 구현
		myimplementsClass.defaultMethod(); // MyNewInterface의 디폴트 메서드
	}
}