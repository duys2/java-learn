package interface_learn.promotion_learn;

public class AnimalPromotionTest {
	public static void main(String[] args) {
		/* 자동 타입 변환 */
		Carnivore carnivore = new Carnivore();

		Tiger tiger = new Tiger();
		Wolf wolf = new Wolf();

		/* 이렇게 Animal의 구현체 클래스를 생성해서 Carnivore.eat(매개변수)로 넘겨줄 수 있다. */
		carnivore.eat(tiger); // 호랑이가 먹이를 먹는 중입니다.
		carnivore.eat(wolf); // 늑대가 먹이를 먹는 중입니다.

		// Animal을 Tiger로 자동 타입 변환
		Animal firstAnimal = new Tiger();

		// Animal을 Wolf로 자동 타입 변환
		Animal secondAnimal = new Wolf();

		carnivore.eat(firstAnimal); // 호랑이가 먹이를 먹는 중입니다.
		carnivore.eat(secondAnimal); // 늑대가 먹이를 먹는 중입니다.
	}
}