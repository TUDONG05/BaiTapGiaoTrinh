package quan_ly_hoc_vien;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
//			HocvienDH a = new HocvienDH();
//			a.nhapTT();
//			a.inTT();
		//test-->ok
//		HocVienLT a = new HocVienLT();
//		a.nhapTT();
//		a.inTT();
//		--> test ok
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("So HVDH: ");
		int n= input.nextInt();
		HocvienDH d[] = new HocvienDH[n];
		
		for(int i=0;i<d.length;i++) {
			d[i]= new HocvienDH();
			d[i].nhapTT();
		}
		
		
		System.out.println("So SVLt:");
		int m = input.nextInt();
		HocVienLT l[]= new HocVienLT[m];
		for(int i=0;i<l.length;i++) {
			l[i]= new HocVienLT();
			l[i].nhapTT();
		}
		
		
		
		for(int i=0;i<d.length;i++) {
			d[i].inTT();
		}
		for(int i=0;i<l.length;i++) 
			l[i].inTT();
		
	}
}
