package instanceof_learn;

public class Carnivore {
	public void eat(Animal animal) {  // Animal 구현 객체 받기
		if (animal instanceof Tiger) {// 구현 객체가 호랑이면
			System.out.println(animal instanceof Tiger);
			System.out.println(animal instanceof Wolf);
			System.out.println("호랑이 구현");
		}

		if (animal instanceof Wolf) { // 구현 객체가 늑대면
			System.out.println(animal instanceof Tiger);
			System.out.println(animal instanceof Wolf);
			System.out.println("늑대 구현");
		}

		animal.eat(); // 구현 객체의 eat() 메서드 실행
	}
}