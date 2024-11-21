package cao_dang_x;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
//	SVCDCQ c1 = new SVCDCQ();
//	c1.nhapThongTin();
//	c1.inThongTin();
//	
	try {
		int n;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Nhap so sinh vien can tao");
			n =input.nextInt();
		}
		while(n<2 || n>4);
		
		
		SVCDCQ sv[] = new SVCDCQ[n];
		
		//khoi tao gia tri ban dau va nhap thong tin
		for(int i=0;i<n;i++) {
			sv[i]=new SVCDCQ();
			sv[i].nhapThongTin();
		}
	//in thong tin
		for(int i=0;i<sv.length;i++)
			sv[i].inThongTin();
		
//		check ton tai
		boolean check=false;
		SVCDCQ ch = new SVCDCQ();
		System.out.println("Nhap msv can tim:");
		String msv = input.next();
		for(int i=0;i<sv.length;i++)
			if(sv[i].getMsv().equals(msv)) {
				check=true;
				ch=sv[i];
			}
		
		if(check)
			ch.inThongTin();
		else
			System.out.println("ko ton tai msv do!");
				
		
//		sap xep theo diem giam dan
		for(int i=0;i<sv.length-1;i++)
			for(int j=i+1;j<n;j++) 
				if(sv[i].tinhDiem()<sv[j].tinhDiem()) {
					SVCDCQ tg= new SVCDCQ();
					tg=sv[i];
					sv[i]=sv[j];
					sv[j]=tg;
				
				}
		System.out.println("mang xep mag diem giam dan:");
		for(int i=0;i<sv.length;i++)
			sv[i].inThongTin();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	
}
}
