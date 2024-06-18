package generic_learn.generic_type;

// 제네릭 타입 T
public class MyGenericType<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}