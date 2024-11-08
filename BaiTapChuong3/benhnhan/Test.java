package benhnhan;

public class Test {
	
	public static void main(String[] args) {
		
		
		BenhVien p1 =new BenhVien();
		p1.nhapTT();
		
		BenhNhan n1 = new BenhNhan();
		n1.nhapTT();
		n1.setBenhVien(p1);
		
		
		System.out.println(n1.toString());
		
	}
}
