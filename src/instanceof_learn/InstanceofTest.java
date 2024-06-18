package instanceof_learn;

public class InstanceofTest {
	public static void main(String[] args) {
		Carnivore carnivore = new Carnivore();

		Tiger tiger = new Tiger();
		Wolf wolf = new Wolf();

		carnivore.eat(tiger);
		/* 출력:
		true
		false
		호랑이 구현
		호랑이가 먹이를 먹는 중입니다.
		*/

		carnivore.eat(wolf);
		/* 출력:
		false
		true
		늑대 구현
		늑대가 먹이를 먹는 중입니다.
		*/
	}
}