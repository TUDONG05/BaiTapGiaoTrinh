package tinh_luong_cong_nhan;
import java.util.Scanner;
public class CNKSP extends CongNhan {
	protected int soSP;
	protected double giaSP;
	protected double thuong;
	
	
	public CNKSP() {
		
	}
	
	public CNKSP(String hoTen, String diaChi, String ngaySinh, String loaiCN,int soSP, double giaSp,double thuong) {
		super(hoTen, diaChi, ngaySinh,loaiCN);
		this.soSP=soSP;
		this.giaSP=giaSp;
		this.thuong=thuong;
	}
	
	@Override 
	public void nhapTT() {
		super.nhapTT();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so sp: ");
		this.soSP=input.nextInt();
		
		System.out.println("Nhap gia sp: ");
		this.giaSP=input.nextDouble();
		
	
		
	}
	
	@Override
	public double tinhLuong() {
		int spqd=1000;
		if(this.soSP -spqd <0)
			this.thuong=0;
		else if(this.soSP -spqd <=100)
			this.thuong=1000000;
		else if(this.soSP <=150);
		return this.soSP * this.giaSP +this.thuong;
	}
	
	@Override
	public void inTT() {
		super.inTT();
		System.out.println("So sp lam dc: " +this.soSP);
		System.out.println("gia moi sp: "+ this.giaSP);
		System.out.printf("Thuong:%.2f\n "+ this.thuong);
	}
}
