package interface_polymorphism_learn;

public class InterfacePolyTest {
	public static void main(String[] args) {
		ProfileService profileService = new ProfileService();
		ProfileDBRepository profileDBRepository = new ProfileDBRepository();
		ProfileMemoryRepository profileMemoryRepository = new ProfileMemoryRepository();

		profileService.saveProfile(); // 출력: 메모리에 프로필 저장하기
		profileService.repository.save(); // 출력: 메모리에 프로필 저장하기
		profileDBRepository.save(); // 출력: DB에 프로필 저장하기
		profileMemoryRepository.save(); // 출력: 메모리에 프로필 저장하기
	}
}