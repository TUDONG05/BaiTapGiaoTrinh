package bai11;
import java.util.Scanner;
public class HinhTron {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap ban kinh: ");
	double r = input.nextDouble();
	System.out.println("Dien tich hinh tron la: " + (r*r*3.14));
	System.out.println("Chu vi hinh tron la: " + (2*r*3.14));
}
}
