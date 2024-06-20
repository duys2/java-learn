package oop_learn;

public class ThisLearn {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("Kevin", 36);
		Person person3 = new Person("Reaper", 41, 188, 91);

		person1.sayHello();
		System.out.println();
		person2.sayHello();
		System.out.println();
		person3.sayHello();
	}
}

class Person {
	/* ---------------- 필드 ---------------- */
	String name;
	int age;
	int height;
	int weight;

	/* ---------------- 생성자 ---------------- */
	public Person() {
		// this()로 다른 생성자 호출하기 (명시적 생성자 호출)
		this("Steve", 25, 197, 108);
	}

	public Person(String name, int age) {
		// 할 거면 이렇게: this()는 첫 번째 문장에 위치
		this(name, age, 166, 58);
		// this.name = name;

		/* 이렇게 하면 오류 발생: this()는 항상 첫 번째 문장에 위치
		this.name = name;
		this(name, age, 166, 58);
		*/
	}

	public Person(String name, int age, int height, int weight) {
		// this를 사용해 현재 객체의 필드에 접근
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	/* ---------------- 메서드 ---------------- */
	public void sayHello() {
		System.out.println("Hello, my name is " + name + "!");
		System.out.println("I am " + age + " years old.");
		System.out.println("My height is " + height + ", and weight is " + weight + ".");
	}
}