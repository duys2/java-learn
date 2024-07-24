package solid_learn.s.bad;

public class UserManager {
	private String name;

	public UserManager(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void saveToDatabase() {
		// 데이터베이스에 저장하는 로직
	}
}