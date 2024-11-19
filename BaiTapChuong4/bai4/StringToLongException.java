package bai4;

public class StringToLongException extends Exception {
	protected String s;
	
	
	public StringToLongException() {
		
	}
	public StringToLongException(String mess) {
		super(mess);
	}
	
}
