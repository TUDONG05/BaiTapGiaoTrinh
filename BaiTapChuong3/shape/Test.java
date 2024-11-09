package shape;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
//	Rectangle r1 = 
//	r1.nhapTT();
//	System.out.println(r1.toString());
		
		
//		Triangle t1 = new Triangle();
//		t1.nhapTT();
//		System.out.println(t1.toString());
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Nhập số HCN muốn tạo: ");
		int n = input.nextInt();
		Rectangle r[]= new Rectangle[n];
		
		//khởi tạo giá trị
		for(int i=0;i<r.length;i++)
			r[i]= new Rectangle();
		//nhập thông tin
		for(int i=0; i<r.length;i++) {
			System.out.println("nhập thông tin HCN thứ " +(i+1));
			r[i].nhapTT();
		}
		
		
		System.out.println("Nhập số Tam giác muốn tạo: ");
		int m = input.nextInt();
		Triangle t[] = new Triangle [m];
		
		for(int i=0;i<t.length;i++)
			t[i]=new Triangle();
		
		
		for(int i=0;i<t.length;i++) {
			System.out.println("Nhập thông tin hình tam giác thứ " +(i+1));
			t[i].nhapTT();
		}
		
		
		
		//hiển thị thông tin
		for(int i=0; i<r.length; i++)
			System.out.println(r[i].toString());
		
		for(int i=0;i<t.length;i++)
			System.out.println(t[i].toString());
		
		
		
		
		
		
}

		
		
	
}
