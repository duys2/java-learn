package inheritance_learn;

public class Eagle extends Animal {
	public Eagle(int weight) {
		this.weight = weight;
	}

	@Override
	void sleep() {
		System.out.println("독수리가 잠을 잡니다.");
	}

	@Override
	public void sayWeight() {
		System.out.println("독수리의 몸무게는 " + weight + "kg 입니다.");
	}
}