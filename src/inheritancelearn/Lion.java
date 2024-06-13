package inheritancelearn;

public class Lion extends Animal {
	public Lion(int weight) {
		this.weight = weight;
	}

	// 오버라이딩(재정의) 명시
	@Override
	void sleep() {
		System.out.println("사자가 잠을 잡니다.");
	}

	@Override
	public void sayWeight() {
		System.out.println("사자의 몸무게는 " + weight + "kg 입니다.");
	}
}