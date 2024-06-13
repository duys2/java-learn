package inheritancelearn;

public class Animal {
	protected int weight = 100; // 부모 자식만 사용하려면 protected

	public Animal() {
	}

	void eat() {
		System.out.println("eat");
	}

	void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}

	void sayWeight() {
	}
}