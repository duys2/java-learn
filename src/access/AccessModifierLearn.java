package access;

public class AccessModifierLearn {
	public static void main(String[] args) {
		AccessTest accessTest = new AccessTest();
		System.out.println(accessTest.num); // 22
		// System.out.println(accessTest.num2); // 접근 불가
		System.out.println(accessTest.num3); // 55
		System.out.println(accessTest.num4); // 76
	}
}