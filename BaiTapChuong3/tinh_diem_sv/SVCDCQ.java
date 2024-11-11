package tinh_diem_sv;

import java.util.Scanner;

public class SVCDCQ extends Nguoi{
	protected double TDKT;
	protected int SMKT;
	protected double DTB;
	protected double DTKTHP;
	public SVCDCQ() {
		
	}

	public SVCDCQ(String hoTen, String ngaySinh, String diaChi, String loaiSV, double TDKT, int SMKT, double DTKTHP) {
		super(hoTen, ngaySinh, diaChi, loaiSV);
		this.TDKT=TDKT;
		this.SMKT=SMKT;
		this.DTKTHP=DTKTHP;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap TDKT:");
		this.TDKT=input.nextDouble();
		
		System.out.println("Nhap SMKT:");
		this.SMKT=input.nextInt();
		
		System.out.println("Nhap DTKTHP: ");
		this.DTKTHP= input.nextDouble();
		
	}

	@Override
	public double tinhDiem() {
		this.DTB = (this.TDKT / this.SMKT + this.DTKTHP)/3;
		return this.DTB;
	}

	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.println("TDKT: " + this.TDKT);
		System.out.println("SMKT: " + this.SMKT);
	}
	
	
	
	
	

}
