package tinh_diem_sv;
import java.util.Scanner;
public class SVCDN extends Nguoi {
	protected double TDKT;
	protected int SMKT;
	protected double DTB;
	public SVCDN() {
		
	}

	public SVCDN(String hoTen, String ngaySinh, String diaChi, String loaiSV, double TDKT, int SMKT) {
		super(hoTen, ngaySinh, diaChi, loaiSV);
		this.TDKT=TDKT;
		this.SMKT=SMKT;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap TDKT:");
		this.TDKT=input.nextDouble();
		
		System.out.println("Nhap SMKT:");
		this.SMKT=input.nextInt();
		
	}

	@Override
	public double tinhDiem() {
		this.DTB = this.TDKT / this.SMKT;
		return this.DTB;
	}

	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.println("TDKT: " + this.TDKT);
		System.out.println("SMKT: " + this.SMKT);
	}
	
	
	
	
	

}
