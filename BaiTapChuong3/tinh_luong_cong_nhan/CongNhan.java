package tinh_luong_cong_nhan;
import java.util.Scanner;
public abstract class CongNhan {
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	protected String loaiCN;
	
	public CongNhan() {
		
	}

	public CongNhan(String hoTen, String ngaySinh, String diaChi, String loaiCN) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiCN = loaiCN;
	}
	
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		this.hoTen=input.next();
		
		System.out.println("Nhap dia chi:");
		this.diaChi=input.next();
		
		System.out.println("Nhap ngay sinh: ");
		this.ngaySinh=input.next();
		
		System.out.println("Nhap loai cong nhan: ");
		this.loaiCN=input.next();
		
		
		
	}
	public abstract double tinhLuong() ;
	
	public void inTT() {
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println(("Dia chi: " + this.diaChi));
		System.out.println("Ngay sinh: " + this.ngaySinh);
		System.out.println("Loai cn: " + this.loaiCN);
		System.out.printf("Luong: %.2f\n" , this.tinhLuong());
	}
	
}
