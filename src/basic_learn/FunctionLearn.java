package basic_learn;

public class FunctionLearn {
	public static void main(String[] args) {
		Test test = new Test();

		int num = test.add(3, 4, 5);

		System.out.println(num); // 12
	}
}

class Test {
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
