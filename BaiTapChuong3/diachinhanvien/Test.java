package diachinhanvien;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiaChi dc1 = new DiaChi("hp12","tamdi","lucnam","bacgiang");
		NhanVien nv1 = new NhanVien("Tu",dc1,"1/3/2005",'F');
		System.out.println(nv1.toString());
	}

}
