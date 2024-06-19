package generic_learn.generic_implements;

// 제네릭 인터페이스 Storage<T>를 구현한 StorageImpl 클래스도 제네릭 타입이어야 한다.
public class GImplementClass<T> implements GInterface<T> {
	private T[] tArray;

	public GImplementClass(int capacity) {
		tArray = (T[])(new Object[capacity]); // (T[])(new Object[n]) 형식
	}

	@Override
	public T get(int index) {
		return tArray[index];
	}

	@Override
	public void add(T item, int index) {
		tArray[index] = item;
	}
}