package bai13;
import java.util.Scanner;
public class TinhTien {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap gia:");
	double gia = input.nextDouble();
	System.out.println("Nhap chiet khau phan tram:");
	double chietKhau=input.nextDouble();
	System.out.println("Gia sau khi giam: "+ ((1-chietKhau)*gia));
	
}
}
