package bai3;

public class StringTooLongexception extends Exception{
	protected String a;
	
	public StringTooLongexception() {
		
	}
	
	public StringTooLongexception(String mess) {
		super(mess);
	}
}
