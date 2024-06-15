package inheritance_learn;

public class Child extends Parent {
	private int age = 40;

	public Child(int num, int age) {
		super(num); // 부모 클래스에 매개 변수가 있는 생성자만 있다면 반드시 자식 클래스의 생성자에서 명시적으로 호출해야 한다.
		this.num = num;
		this.age = age;
	}

	@Override
	public void testMethod() {
		// 부모 클래스의 메서드 명시적 참조(호출)
		super.testMethod();
		System.out.println("Child Method 실행");
	}

	public void overloadMethod(int age) { // 매개변수가 다르면 메서드 오버로딩이다.
		System.out.println("Child age is " + age);
	}

	@Override
	public void overrideMethod() { // Child의 overrideMethod()가 Parent의 overrideMethod()를 오버라이드한다
		// Parent의 overrideMethod() 호출하기
		// super.overrideMethod();
		System.out.println("오버라이드 한 메서드");
	}
}