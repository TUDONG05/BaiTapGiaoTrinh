package addressBasic;

public class Test {
public static void main(String[] args) {
	Address a1 = new Address();
	
	// kiem tra setter()
	a1.setThon("Kieu Mai");
	a1.setXa("Phuc Dien");
	a1.setHuyen("Bac Tu Liem");
	a1.setTinh("Ha Noi");
	
	//kiem tra getter()
	System.out.println("Thon: " + a1.getThon());
	System.out.println("Phuong/Xa: " + a1.getXa());
	System.out.println("Quan/Huyen: " + a1.getHuyen());
	System.out.println("Tinh/Thanh Pho: " + a1.getTinh());
	//kiem tra toString()
	System.out.println(a1.toString());
}
}
