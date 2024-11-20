package bai14;
import java.util.Scanner;
public class TienDien {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap so dien: ");
	double soDien = input.nextDouble();
	double soTien=0;
	if(soDien<0)
		System.out.println("So dien khong the am. Moi nhap lai");
	else if(soDien<=50)
		soTien=soDien*1484;
	else if(soDien <=100)
		soTien=50*1484 + (soDien-50)*1533;
	else if(soDien <=200)
		soTien=50*1484 + 50*1533 + (soDien-100)*1786;
	else 
		soTien=50*1484 + 50*1533+100*1786 +(soDien-200)*2242;
		
	System.out.println("So tien phai tra: " + soTien);
	
}
}
