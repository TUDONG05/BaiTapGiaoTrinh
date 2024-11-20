package bai10;
import java.util.Scanner;
public class HinhChuNhat {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap chieu dai:");
	double a= input.nextDouble();
	
	System.out.println("Nhap chieu rong:");
	double b= input.nextDouble();
	
	System.out.println("Chu vi hcn la: " + (2*(a+b)));
	System.out.println("Dien tich hcn la: " + (a*b));
}
}
