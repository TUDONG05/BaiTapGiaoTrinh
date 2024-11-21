package cao_dang_x;
import java.util.Scanner;
public class Test {
	

	public void nhap(SVCDCQ sv[]) {
		//khoi tao gia tri ban dau va nhap thong tin
		for(int i=0;i<sv.length;i++) {
			sv[i]=new SVCDCQ();
			sv[i].nhapThongTin();
		}

	}
	
	
//	sap xep theo diem giam dan
	public void sapGiam(SVCDCQ sv[]) {
			for(int i=0;i<sv.length-1;i++)
		for(int j=i+1;j<sv.length;j++) 
			if(sv[i].tinhDiem()<sv[j].tinhDiem()) {
				SVCDCQ tg= new SVCDCQ();
				tg=sv[i];
				sv[i]=sv[j];
				sv[j]=tg;
			
			}
			
			
			
	}
	public void in(SVCDCQ sv[]) {

		//in thong tin
		for(int i=0;i<sv.length;i++)
			sv[i].inThongTin();
	}
	
//	check ton tai
	public void checking(SVCDCQ sv[],String msv) {
		boolean check=false;
	SVCDCQ ch = new SVCDCQ();
	
	for(int i=0;i<sv.length;i++)
		if(sv[i].getMsv().equals(msv)) {
			check=true;
			ch=sv[i];
		}
	
	if(check)
		ch.inThongTin();
	else
		System.out.println("ko ton tai msv do!");
	}
	
			
	public static void main(String[] args) {

	
		try {

		int n;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Nhap so sinh vien can tao");
			n =input.nextInt();
			
		}
		while(n<2 || n>4);
		
		



			
			
		SVCDCQ sv[] = new SVCDCQ[n];
		
		Test test = new Test();
		test.nhap(sv);
		test.in(sv);
		
		System.out.println("Nhap msv can tim:");
		String msv = input.next();
		test.checking(sv, msv);
		
		System.out.println("Danh sach sv diem giam dan");
		test.sapGiam(sv);
		test.in(sv);
		
		
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
	}

	
	
}
}