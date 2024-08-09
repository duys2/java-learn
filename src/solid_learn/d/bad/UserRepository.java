package solid_learn.d.bad;

public class UserRepository {
	private MySQLDatabase db;

	public UserRepository() {
		db = new MySQLDatabase();
	}

	public void findUser(int userId) {
		db.connect();
		db.query("SELECT * FROM users WHERE id = " + userId);
	}
}