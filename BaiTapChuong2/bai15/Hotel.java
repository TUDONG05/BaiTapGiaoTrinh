package bai15;
import java.util.Scanner;
public class Hotel {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap so ngay luu tru:");
	int days=input.nextInt();
	
	System.out.println("Nhap don gia:");
	double gia =input.nextDouble();
	double tien=0;
	if(days<2)
		tien=days *gia;
	else if(days <=4)
		tien=1* gia + (days-1)*(1-0.2)*gia;
	else if(days <=10)
		tien=1*gia + 3*(1-0.2)*gia +(days-4)*(1-0.4)*gia;
	else 
		tien=1*gia + 3*(1-0.2)*gia +6*(1-0.4)*gia+(days-10)*(1-0.6)*gia;
	
	
	System.out.println("so tien phai tra: "+ tien);
}
}
