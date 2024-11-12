package tinh_luong_lao_dong;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Test {
public static void main(String[] args) {

	
	ArrayList <KiSu> list = new ArrayList<>();

	Scanner input = new Scanner(System.in);
	System.out.println("Nhap so phan tu cua mang: ");
	int n = input.nextInt();
	
	for(int i=0;i<n;i++) {
		KiSu ks = new KiSu();
		ks.nhapTT();
		list.add(ks);
	}
	int luachon;
	do {
		
		
		
		
	System.out.println("1. Thêm một kĩ sư");
	System.out.println("2. Hiển thị danh sách ");
	System.out.println("3. TÌm kĩ sư theo tên");
	System.out.println("4. Xóa kĩ sư theo địa chỉ");
	System.out.println("5. Sắp xếp danh sách theo lương tăng");
	System.out.println("6. Kết thúc");
	System.out.println("Bạn chọn: ");
	luachon = input.nextInt();
	
	
	
	switch(luachon) {
		case 1:
			KiSu a = new KiSu();
			a.nhapTT();
			list.add(a);
			break;
			
		case 2:
			for(KiSu i: list) {
				i.inTT();
			}
			break;
		case 3:
			System.out.println("Nhập tên bạn muốn tìm: ");
			String s = input.next();
			for(KiSu i:list) {
				if(i.getHoTen().equals(s))
				i.inTT();
			}
			break;
		case 4:
			System.out.println("Nhập địa chỉ muốn xóa: ");
			String t = input.next();
			for(KiSu i:list) {
				if(i.getDiaChi().equalsIgnoreCase(t));
					
			boolean rm=	list.remove(i);
			
			if(!rm)
				System.out.println("không có ai tên như vậy để xóa");
			else 
				System.out.println("đã xóa khỏi danh sách");
			}
			for(KiSu i:list)
				i.inTT();
			break;
		case 5:
			Collections.sort(list);
			System.out.println("Danh sach da sap xep: ");
			for(KiSu i:list)
				i.inTT();
			break;
				
					
		case 6:
			System.out.println("Ket thuc chuong trinh!");
			break;
		
	}
	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		while(luachon!=6);		
			
			
			
			
//			for(int i=0;i<a.length;i++)
//			for(int j=i+1;j<a.length;j++)
//				if(a[i].tinhLuong() >a[j].tinhLuong()) {
//					KiSu tg = a[i];
//					a[i] =a[j];
//					a[j]=tg;
//				}
	//	
//		for(int i=0;i<a.length;i++) {
//			a[i].inTT();
//		}
			
			
			
			
			
	

	

	
	
	
	
	
	
//	
//	System.out.println("Sap xep theo tien luong tang dan: ");
//	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//	

}
}
