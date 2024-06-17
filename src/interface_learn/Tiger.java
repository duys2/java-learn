package interface_learn;

// Tiger 클래스는 Animal 인터페이스를 구현한다.
public class Tiger implements Animal {
	@Override
	public void eat() {
		System.out.println("호랑이가 먹이를 먹는 중입니다.");
	}

	@Override
	public void sleep() {
		System.out.println("호랑이가 자는 중입니다.");
	}

	@Override
	public void walk() {
		System.out.println("호랑이가 걷는 중입니다.");
	}
}