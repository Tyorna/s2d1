package es2;

public class NumberException extends RuntimeException {
	public NumberException(int number) {
		super("Il numero inserito è zero!");
	}
}
