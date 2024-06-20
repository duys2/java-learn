package interface_learn.polymorphism_learn;

public class ProfileService {
	ProfileRepository repository; // 인터페이스는 필드에서도 선언 가능

	public void saveProfile() {
		/* 이 부분만 바꾸면 된다: 구현 객체를 교체하면서 프로그램의 실행 결과가 다양해지는 것이 바로 인터페이스의 다형성 */
		repository = new ProfileMemoryRepository();
		// repository = new ProfileDBRepository();

		repository.save();
	}

	// 오버로딩: 인터페이스는 매개변수에서도 선언 가능
	public void saveProfile(ProfileRepository repository) {
		repository.save();
	}
}