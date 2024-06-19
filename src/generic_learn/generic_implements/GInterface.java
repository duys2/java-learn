package generic_learn.generic_implements;

public interface GInterface<T> {
	T get(int index);

	void add(T item, int index);
}