package interface_learn;

public class AnimalTest {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Wolf wolf = new Wolf();

		tiger.eat(); // 호랑이가 먹이를 먹는 중입니다.
		wolf.eat(); // 늑대가 먹이를 먹는 중입니다.
		tiger.sleep(); // 호랑이가 자는 중입니다.
		wolf.sleep(); // 늑대가 수면 중입니다.
		tiger.walk(); // 호랑이가 걷는 중입니다.
		wolf.walk(); // 늑대가 걷는 중입니다.
	}
}