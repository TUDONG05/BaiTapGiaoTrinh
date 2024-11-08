package sinhvien;

public class Test {
public static void main(String[] args) {
	
	Truong t1 = new Truong();
	t1.nhapTT();
	
	SinhVien v1= new SinhVien();
	v1.nhapTT();
	v1.setTruong(t1);
	System.out.println(v1.toString());
}
}
