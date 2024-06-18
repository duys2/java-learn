package generic_learn.wildcard;

public class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		// 타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열을 생성할 수 없고 (T[])(new Object[n])으로 생성해야 한다.
		this.students = (T[])(new Object[capacity]); // (T[])(new Object[n]) 외우기
	}

	public String getName() {
		return this.name;
	}

	public T[] getStudents() {
		return this.students;
	}

	public void add(T t) {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] == null) { // 수강생이 없으면
				this.students[i] = t; // 추가
				break;
			}
		}
	}
}