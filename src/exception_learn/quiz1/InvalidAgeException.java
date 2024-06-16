package exception_learn.quiz1;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}