package cao_dang_x;
import java.util.Scanner;
public abstract class Nguoi {
	protected String hoTen;
	protected String diaChi;
	protected String ngaySinh;
	
	//constructor
	public Nguoi() {
		
	}

	public Nguoi(String hoTen, String diaChi, String ngaySinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
	}
	
	
	public String getHoTen() {
		return hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void nhapThongTin() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.hoTen = input.next();
		
		System.out.println("Nhap dia chi: ");
		this.diaChi=input.next();
		
		System.out.println("Nhap ngay sinh: ");
		this.ngaySinh=input.next();
	}
	
	public void inThongTin() {
		System.out.println("-----------------------");
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println("Dia chi: " + this.diaChi);
		System.out.println("Ngay sinh: " + this.ngaySinh);
	}
	public abstract double tinhDiem();
	
	
}
