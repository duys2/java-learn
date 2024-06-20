package oop_learn;

public class SetterGetterLearn {
	public static void main(String[] args) {
		SetterGetterTest setterGetterTest = new SetterGetterTest();
		System.out.println(setterGetterTest.getPositiveNumber()); // 100
		setterGetterTest.setPositiveNumber(50); // 인스턴스 setterGetterTest의 positiveNumber를 50으로 설정
		setterGetterTest.setPositiveNumber(-29); // 유효한 값을 입력해 주세요! 출력
		System.out.println(setterGetterTest.getPositiveNumber()); // 50
	}
}

class SetterGetterTest {
	// 필드 선언
	private int positiveNumber = 100;

	// 접근자
	public int getPositiveNumber() {
		return positiveNumber;
	}

	// 설정자
	public void setPositiveNumber(int positiveNumber) {
		if (positiveNumber > 0) { // 양수면
			this.positiveNumber = positiveNumber;
		} else { // 양수가 아니면
			System.out.println("유효한 값을 입력해 주세요!");
		}
	}
}