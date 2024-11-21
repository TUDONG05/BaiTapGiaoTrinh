package cao_dang_x;
import java.util.Scanner;
public class SVCDCQ extends Nguoi implements SVCDN{
	protected double TDKT;
	protected int SMKT;
	protected String msv;
	
	//constructor
	public SVCDCQ() {
		
	}
	
	public SVCDCQ(String hoTen, String diaChi, String ngaySinh,double TDKT, int SMKT,String msv) {
		super(hoTen, diaChi,ngaySinh);
		this.TDKT=TDKT;
		this.SMKT=SMKT;
		this.msv=msv;
	}
	
	@Override
	public void nhapThongTin() {
		Scanner input = new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap msv:");
		this.msv=input.next();
		System.out.println("Nhap TDKT:");
		this.TDKT=input.nextInt();
		System.out.println("Nhap SMKT:");
		this.SMKT=input.nextInt();

		
		
	}
	
	
	
	
	public double getTDKT() {
		return TDKT;
	}

	public int getSMKT() {
		return SMKT;
	}

	public String getMsv() {
		return msv;
	}

	public void setTDKT(double tDKT) {
		TDKT = tDKT;
	}

	public void setSMKT(int sMKT) {
		SMKT = sMKT;
	}

	public void setMsv(String msv) {
		this.msv = msv;
	}

	@Override
	public void inThongTin(){
		super.inThongTin();
		System.out.println("MSV:"+this.msv);
		System.out.println("TDKT: "+ this.TDKT);
		System.out.println("SMKT: " + this.SMKT);
		System.out.println("DTB: "+this.tinhDiem());
	}
	@Override
	public double tinhDiem() {
		return this.TDKT/this.SMKT;
	}
}
