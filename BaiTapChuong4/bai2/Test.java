package bai2;

public class Test {
	public static void main(String[] args) throws InvalidDateException {
	try {
		ThoiGian a = new ThoiGian(33,12,2005);
	System.out.println("Ngay vua nhap: " + a);
	}
	catch(InvalidDateException e) {
		System.out.println("Loi: " + e.getMessage());
	}
	

	}
	
	
}
