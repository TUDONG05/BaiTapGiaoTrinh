package bai7;
import java.util.Scanner;
public class SwitchCase {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("a=");
	double a = input.nextDouble();
	System.out.println("b=");
	double b = input.nextDouble();
	
	System.out.println("A. Tinh tong");
	System.out.println("S. Tinh hieu");
	System.out.println("M. Tinh tich");
	System.out.println("D. Tinh thuong");
	System.out.println("----------------");
	System.out.println("Nhap lua chon:");
	Character luachon =input.next().charAt(0);
	if(luachon.equals('A') || luachon.equals('S') || luachon.equals('M')|| luachon.equals('D')) {
			switch (luachon) {
	case 'A':
		System.out.println("a + b = " + (a + b));
		break;
	case 'S':
		System.out.println("a - b = " + (a - b));
		break;
	case 'M':
		System.out.println("a * b = " + (a * b));
		break;
	case 'D':
		System.out.println("a / b = " + (a / b));
		break;
	}
	}
	else {
		System.out.println("Ky tu vua nhap khong hop le!!");
	}
		

	

	
	
}
}
