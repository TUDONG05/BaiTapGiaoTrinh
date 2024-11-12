package tinh_luong_lao_dong;
import java.util.Scanner;
import java.util.Collection;
import java.util.Comparator;
public class KiSu  extends NguoiLaoDong implements Comparable<KiSu> {
	
	protected double luongCB;
	protected double hsLuong;
	protected double thuong;
	protected int soNC;
	
	public KiSu() {
		
	}

	public KiSu(String hoTen, String diaChi, String loaiLaoDong, double luongCB, double hsLuong, double thuong, int soNC) {
		super(hoTen, diaChi, loaiLaoDong);
		this.luongCB=luongCB;
		this.hsLuong=hsLuong;
		this.thuong=thuong;
		this.soNC=soNC;
		
	}
	
	@Override 
	public void nhapTT() {
		super.nhapTT();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập lương cơ bản: ");
		this.luongCB=input.nextDouble();
		
		System.out.println("Nhập hệ số lương: ");
		this.hsLuong=input.nextDouble();
		
		System.out.println("Nhập số ngày công: ");
		this.soNC=input.nextInt();
		
		
		
	}
	@Override
	public double tinhLuong() {
		if(this.soNC>=25)
			this.thuong=2000000;
		else if(this.soNC>15)
			this.thuong=1000000;
		else 
			this.thuong=500000;
		
		
		
		
		return this.luongCB *this.hsLuong + this.thuong;
	}
	
	
	@Override
	public int compareTo(KiSu a) {
	return Double.compare(this.tinhLuong(),a.tinhLuong());
	}
	@Override
	public void inTT() {
		super.inTT();
		System.out.printf("Lương cơ bản:%.2f\n" , this.luongCB);
		System.out.println("Hệ số lương: " +this.hsLuong);
		System.out.println("Thưởng: " +this.thuong);
	}
	

}
