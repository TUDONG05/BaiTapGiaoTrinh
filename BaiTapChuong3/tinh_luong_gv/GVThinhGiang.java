package tinh_luong_gv;
import java.util.Scanner;
public class GVThinhGiang extends GiangVien {
	
	protected int soTiet;
	protected double donGia;
	protected double ptThuNhap;
	
	
	public GVThinhGiang() {
		
	}
	
	public GVThinhGiang(String hoTen, String diaChi, String loaiGV, int soTiet, double donGia) {
		super(hoTen, diaChi, loaiGV);
		this.soTiet= soTiet;
		this.donGia= donGia;
	}
	@Override
	public void nhapTT() {
		Scanner input = new Scanner (System.in);
		super.nhapTT();
		System.out.println("nhap so tiet: ");
		this.soTiet=input.nextInt();
		
		System.out.println("nhap don gia: ");
		this.donGia=input.nextDouble();
		
	}
	
	@Override
	public double tinhLuong() {
		this.ptThuNhap=0.15 * this.soTiet * this.donGia;
		return this.soTiet * this.donGia - this.ptThuNhap;
		
	}
	
	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.println("So tiet: " + this.soTiet);
		System.out.println(("Don gia: " + this.donGia));
		
	}
	

}
