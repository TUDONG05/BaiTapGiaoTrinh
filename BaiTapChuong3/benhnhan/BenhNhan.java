package benhnhan;
import java.util.Scanner;
public class BenhNhan extends Nguoi{
	protected String tieuSu;
	protected String chanDoan;
	protected BenhVien benhVien;
	
	
	public BenhNhan() {
		
	}
	
	public BenhNhan(String ten, int tuoi, char gioiTinh,String tieuSu, String chanDoan,BenhVien benhVien) {
		super(ten,tuoi,gioiTinh);
		this.tieuSu=tieuSu;
		this.chanDoan=chanDoan;
		this.benhVien=benhVien;
		
		
	}

	public String getTieuSu() {
		return tieuSu;
	}

	public String getChanDoan() {
		return chanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setTieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}

	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}

	
	public void nhapTT() {
		System.out.println("nhap thong tin benh nhan:");
		super.nhapTT();
		Scanner input =new Scanner(System.in);
		System.out.println("tien su: ");
		this.tieuSu=input.next();
		
		System.out.println("chan doan:");
		this.chanDoan=input.next();
		
		
	}
	@Override
	public String toString() {
		return super.toString()+ "BenhNhan [tieuSu=" + tieuSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien + "]";
	}
	
	
	
}
