package basic_learn;

public class FinalLearn {
	public static void main(String[] args) {
		FinalTest finalTest = new FinalTest(25);

		System.out.println(finalTest.field); // 20
		System.out.println(finalTest.constructor); // 25

		// 아래 코드는 오류 발생: final 변수의 값을 바꾸려고 하기 때문
		// finalTest.field = 22;
		// finalTest.constructor = 33;

		// 클래스.필드명
		System.out.println(StaticFinalLearn.PI);
		System.out.println(StaticFinalLearn.NEW_STATIC_FIELD);
	}
}

class FinalTest {
	final int field = 20;
	final int constructor;

	public FinalTest(int num) {
		this.constructor = num;
	}
}

class StaticFinalLearn {
	static double PI = 3.14; // 선언과 동시에 초기화
	static String NEW_STATIC_FIELD;

	// 정적블록에서 초기화
	static {
		NEW_STATIC_FIELD = "Hello!";
	}
}