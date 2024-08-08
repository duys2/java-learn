package solid_learn.i.good;

public class AllInOnePrinter implements Printer, Scanner, Fax {
	@Override
	public void print() {
		// 프린트 로직
	}

	@Override
	public void scan() {
		// 스캔 로직
	}

	@Override
	public void fax() {
		// 팩스 로직
	}
}