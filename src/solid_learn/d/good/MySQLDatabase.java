package solid_learn.d.good;

public class MySQLDatabase implements Database {
	@Override
	public void connect() {
		// 연결 로직
	}

	@Override
	public void query(String sql) {
		// 쿼리 실행 로직
	}
}