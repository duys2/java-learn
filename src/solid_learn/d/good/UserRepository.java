package solid_learn.d.good;

public class UserRepository {
	private Database db;

	public UserRepository(Database db) {
		this.db = db;
	}

	public void findUser(int userId) {
		db.connect();
		db.query("SELECT * FROM users WHERE id = " + userId);
	}
}