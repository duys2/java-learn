package solid_learn.d.good;

public interface Database {
	void connect();

	void query(String sql);
}