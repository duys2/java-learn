package exception_learn;

public class MyCustomException extends Exception {
	public MyCustomException(String errorMessage) {
		super(errorMessage);
	}
}