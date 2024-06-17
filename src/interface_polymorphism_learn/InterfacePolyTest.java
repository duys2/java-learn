package interface_polymorphism_learn;

public class InterfacePolyTest {
	public static void main(String[] args) {
		ProfileService profileService = new ProfileService();

		profileService.saveProfile(); // 출력: 메모리에 프로필 저장하기
		profileService.repository.save(); // 출력: 메모리에 프로필 저장하기

		/* 각 구현 객체로 출력해 보기 */
		ProfileDBRepository profileDBRepository = new ProfileDBRepository();
		ProfileMemoryRepository profileMemoryRepository = new ProfileMemoryRepository();

		profileDBRepository.save(); // 출력: DB에 프로필 저장하기
		profileMemoryRepository.save(); // 출력: 메모리에 프로필 저장하기

		/* 오버로드한 메서드 호출: 매개변수로 구현 객체 전달 == profileDBRepository.save() 실행 */
		profileService.saveProfile(profileDBRepository); // 출력: DB에 프로필 저장하기
	}
}