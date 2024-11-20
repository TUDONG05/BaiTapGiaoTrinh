package bai5;
import java.util.Scanner;
public class Bai5 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Nhap so nguyen: ");
	int a =input.nextInt();
	
	System.out.println("Nhap so thuc: ");
	double b = input.nextDouble();
	
	System.out.println("Nhap ky tu: ");
	char c =input.next().charAt(0);
	
	System.out.println("Nhap mot chuoi ki tu:");
	String d =input.next();
	
	System.out.println("So nguyen da nhap: " + a);
	System.out.println("So thuc vua nhap: " + b);
	System.out.println("Ky tu vua nhap: " + c);
	System.out.println("Chuoi vua nhap: " + d);
}
}
