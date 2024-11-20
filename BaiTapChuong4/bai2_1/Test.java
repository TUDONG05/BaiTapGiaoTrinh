package bai2_1;

public class Test {
public static void main(String[] args) {
	
	
	try {
		ThoiGian x = new ThoiGian();
		x.nhap();
		x.inTT();
	}
	catch(InvalidDateException e) {
		System.out.println(e.getMessage());
	}
	
	
}
}
