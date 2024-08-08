package solid_learn.i.bad;

public class SimplePrinter implements Printer {
	@Override
	public void print() {
		// 프린트 로직
	}

	@Override
	public void scan() {
		throw new UnsupportedOperationException("Not supported");
	}

	@Override
	public void fax() {
		throw new UnsupportedOperationException("Not supported");
	}
}