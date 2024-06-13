package inheritancelearn;

public class Parent {
	int num;

	public Parent(int num) {
		this.num = num;
	}

	public void testMethod() {
		System.out.println("Parent method 실행");
	}

	public void overloadMethod() {
		System.out.println("Parent");
	}

	public void overrideMethod() {
		System.out.println("부모의 메서드");
	}
}