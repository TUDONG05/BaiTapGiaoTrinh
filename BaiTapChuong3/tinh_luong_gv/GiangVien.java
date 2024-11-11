package tinh_luong_gv;
import java.util.Scanner;
public abstract class GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGV;
	
	public GiangVien() {
		
	}

	public GiangVien(String hoTen, String diaChi, String loaiGV) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGV = loaiGV;
	}
	
	
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap ho ten: ");
		this.hoTen=input.next();
		
		System.out.println("Nhap dia chi: ");
		this.diaChi=input.next();
		
		System.out.println("Nhap loai GV(Cơ hữu/ thỉnh giảng): ");
		this.loaiGV=input.next();
	}
	
	public abstract double tinhLuong();

	public void inThongTin() {
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println(("Địa chỉ: " + this.diaChi));
		System.out.println("Loại giảng viên: " + this.loaiGV);
		System.out.printf("Lương: %.2f\n",this.tinhLuong ());
		
	}
	
	
}
