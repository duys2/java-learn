package interface_learn.promotion_learn;

public class Carnivore {
	// Tiger를 매개변수로 넘겨주면 Animal animal = new Tiger(); 로 자동 타입 변환
	public void eat(Animal animal) {  // Animal 구현 객체
		animal.eat(); // 구현 객체의 eat() 메서드 실행
	}
}