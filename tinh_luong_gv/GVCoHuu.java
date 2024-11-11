package tinh_luong_gv;
import java.util.Scanner;
public class GVCoHuu extends GiangVien {
	protected double luongCB;
	protected double hsLuong;
	protected double phuCap;
	protected int thamNien;
	
	public GVCoHuu() {
		
	}

	public GVCoHuu(String hoTen, String diaChi, String loaiGV,double luongCB, double hsLuong, double phuCap, int thamNien) {
		super(hoTen, diaChi, loaiGV);
		this.luongCB= luongCB;
		this.hsLuong= hsLuong;
		this.phuCap= phuCap;
		this.thamNien = thamNien;
	}
	
	@Override
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap luong co ban: ");
		this.luongCB=input.nextDouble();
		
		System.out.println("Nhap he so luong: ");
		this.hsLuong=input.nextDouble();
		
		System.out.println("Nhap so nam tham nien: ");
		this.thamNien=input.nextInt();
		
	}
	
	@Override
	public  double tinhLuong() {
		if(this.thamNien < 5)
			this.phuCap =0;
		else {
			this.phuCap= (this.thamNien / 100.0) *this.luongCB;
		}
		return this.luongCB * this.hsLuong + this.phuCap;
	}
	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.printf("Luong co ban: %.2f\n" , this.luongCB);
		System.out.println("He so luong: " + this.hsLuong);
		System.out.println("Phu cap: " + this.phuCap);
		System.out.println("So nam tham nien: " + this.thamNien);
	}
	
}
