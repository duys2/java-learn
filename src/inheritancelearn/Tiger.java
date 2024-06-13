package inheritancelearn;

public class Tiger extends Animal {
	public Tiger(int weight) {
		this.weight = weight;
	}

	@Override
	void sleep() {
		System.out.println("호랑이가 잠을 잡니다.");
	}

	@Override
	public void sayWeight() {
		System.out.println("호랑이의 몸무게는 " + weight + "kg 입니다.");
	}
}