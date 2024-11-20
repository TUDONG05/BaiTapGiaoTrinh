package bai12;
import java.util.Scanner;
public class XepLoai {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap diem:");
	double d = input.nextDouble();
	if(d<50)
		System.out.println("F");
	else if(d <70)
		System.out.println("D");
	else if(d<80)
		System.out.println("C");
	else if(d<90)
		System.out.println("B");
	else if(d<=100)
		System.out.println("A");
	else
		System.out.println("Loi nhap diem!!");
}
}
