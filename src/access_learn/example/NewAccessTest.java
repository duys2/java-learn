package access_learn.example;

import access_learn.AccessTest;

public class NewAccessTest extends AccessTest {
	public static void main(String[] args) {
		NewAccessTest newAccessTest = new NewAccessTest();
		System.out.println(newAccessTest.num3); // 55
		System.out.println(newAccessTest.num4); // 76
	}
}