package interface_learn.promotion_learn;

// Wolf 클래스는 Animal 인터페이스를 구현한다.
public class Wolf implements Animal {
	@Override
	public void eat() {
		System.out.println("늑대가 먹이를 먹는 중입니다.");
	}

	@Override
	public void sleep() {
		System.out.println("늑대가 수면 중입니다.");
	}

	@Override
	public void walk() {
		System.out.println("늑대가 걷는 중입니다.");
	}
}