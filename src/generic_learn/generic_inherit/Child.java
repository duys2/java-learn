package generic_learn.generic_inherit;

// 자식 제네릭 타입은 추가적으로 타입 파라미터를 가질 수 있다.
public class Child<T, M> extends Parent<T>{
	private M m;

	public M getM() {
		return m;
	}

	public void setM(M m) {
		this.m = m;
	}
}