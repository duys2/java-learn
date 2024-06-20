package collection_learn.set;

import java.util.Objects;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	/* ---------------- IntelliJ 자동 생성 메서드 ---------------- */
	/*@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person person = (Person)o;
		return age == person.age && Objects.equals(name, person.name);
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}*/

	/* ---------------- 강의 교안 메서드 ---------------- */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person)obj;
			return person.name.equals(this.name) && person.age == this.age;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}