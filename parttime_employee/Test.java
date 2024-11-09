package parttime_employee;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
//			Person p1 = new Person();
//			p1.nhapTT();
//			System.out.println(p1.toString());
		
		
		
//		Person p1 = new Employee();
//		Employee p11=(Employee)p1;
//		p11.nhapTT();
//		System.out.println(p11.toString());
		
//		PartTimeEmployee p1 = new PartTimeEmployee();
//	p1.nhapTT();
//	System.out.println(p1.toString());

		Scanner input= new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên: ");
		int n = input.nextInt();
		PartTimeEmployee pt[] = new PartTimeEmployee[n];
		
		//khoi tao gia tri cho n doi tuong
		for(int i=0; i<pt.length; i++)
			pt[i] = new PartTimeEmployee();
		
		for(int i=0; i<pt.length;i++) {
			System.out.println("Nhập thông tin nhân viên " + (i+1) + ": ");
			pt[i].nhapTT();
		}
			
		
		
		for(int i=0; i<pt.length; i++)
			System.out.println(pt[i].toString());
		
	}
	
	
	
	
}

