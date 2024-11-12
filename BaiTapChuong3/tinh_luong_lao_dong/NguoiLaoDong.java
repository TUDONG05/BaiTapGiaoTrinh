package tinh_luong_lao_dong;
import java.util.Scanner;
public abstract class NguoiLaoDong {
	protected String hoTen;
	protected String diaChi;
	protected String loaiLaoDong;
	
	
	public NguoiLaoDong() {
		
	}


	public NguoiLaoDong(String hoTen, String diaChi, String loaiLaoDong) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLaoDong = loaiLaoDong;
	}


	public String getHoTen() {
		return hoTen;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public String getLoaiLaoDong() {
		return loaiLaoDong;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public void setLoaiLaoDong(String loaiLaoDong) {
		this.loaiLaoDong = loaiLaoDong;
	}
	
	
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		this.hoTen=input.next();
		
		System.out.println("Nhập địa chỉ:");
		this.diaChi=input.next();
		
		System.out.println("Nhập loại lao động:");
		this.loaiLaoDong=input.next();
	}
	
	public abstract double tinhLuong();
	
	public void inTT() {
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Địa chỉ: " + this.diaChi);
		System.out.println("Loại lao động: " + this.loaiLaoDong);
		System.out.printf("Lương tháng: %.2f\nn " , this.tinhLuong());
	}


	public int compareTo(KiSu a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
