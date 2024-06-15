package inheritance_learn;

public class InheritanceTest {
	public static void main(String[] args) {
		/*Lion lion = new Lion(130);
		Tiger tiger = new Tiger(105);
		Eagle eagle = new Eagle(46);

		// eat()는 오버라이딩하지 않았기에 부모 클래스의 eat()가 실행된다.
		lion.eat();
		tiger.eat();
		eagle.eat();

		lion.sleep();
		tiger.sleep();
		eagle.sleep();

		lion.sayWeight();
		tiger.sayWeight();
		eagle.sayWeight();*/

		Parent parent = new Parent(10);
		Child child = new Child(20, 10);

		// parent.testMethod();
		// System.out.println();
		// child.testMethod();

		// parent.overloadMethod();
		// child.overloadMethod(20); // 오버 로딩한 메서드

		parent.overrideMethod();
		child.overrideMethod();
	}
}