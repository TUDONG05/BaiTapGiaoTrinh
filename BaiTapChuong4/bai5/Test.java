package bai5;
import java .util.Scanner;
public class Test {
public static void main(String[] args) throws OutOfRangeException {
	Scanner input = new Scanner(System.in);
	try {
	
	System.out.println("Nhap luong");
	double n = input.nextDouble();	
	if(n< 5000000 || n>20000000)
		throw new OutOfRangeException("So tien da nhap nam ngoai pham vi!!");
	
	
	}
	catch(OutOfRangeException e) {
		System.out.println("loi: " +e.getMessage());
	}
	finally {
		input.close();
	}
	
	
}
}
