package tinh_luong_cong_nhan;
import java.util.Scanner;
public class CNTCN extends CongNhan{
	protected double luongCB;
	protected double hsLuong;
	protected double thuong;
	protected int soNC;
	
	public CNTCN() {
		
	}
	
	public CNTCN(String hoTen, String diaChi, String ngaySinh, String loaiCN,double luongCB, double hsLuong, double thuong,int soNC) {
		super(hoTen, diaChi, ngaySinh,loaiCN);
		this.luongCB=luongCB;
		this.hsLuong=hsLuong;
		this.soNC=soNC;
	}
	@Override 
	public void nhapTT() {
		super.nhapTT();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap luong cb: ");
		this.luongCB=input.nextDouble();
		
		System.out.println("nhap he so luong: ");
		this.hsLuong=input.nextDouble();
		
		System.out.println("Nhap so ngay cong: ");
		this.soNC= input.nextInt();
		
		
	}
	@Override 
	public double tinhLuong() {
		if(this.soNC<20)
			this.thuong=0;
		else 
			this.thuong=0.012*this.luongCB;
		
		return this.luongCB * this.hsLuong + this.thuong;
	}
	
	@Override
	public void inTT() {
		super.inTT();
		System.out.println("he so luong:" +this.hsLuong);
		System.out.println("so ngay cong: " +  this.soNC);
		System.out.printf("thuong: %.2f\n" ,this.thuong);
		System.out.printf("Luong cb: %.2f\n " ,this.luongCB);
	}
	
	
}
