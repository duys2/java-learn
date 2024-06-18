package generic_learn.generic_type;

public class GenericTypeTest {
	public static void main(String[] args) {
		MyObjectType myObjectType = new MyObjectType();
		myObjectType.setObject(22);
		int num1 = (int)myObjectType.getObject(); // 강제 형변환이 필요하다.

		MyGenericType<Integer> myGenericType = new MyGenericType<>();
		myGenericType.setValue(22);
		int nu2 = myGenericType.getValue(); // 강제 형변환이 필요없다.
	}
}