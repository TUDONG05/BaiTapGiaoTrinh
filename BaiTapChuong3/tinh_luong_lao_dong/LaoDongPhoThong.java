package tinh_luong_lao_dong;
import java.util.Scanner;
public class LaoDongPhoThong extends NguoiLaoDong {
	protected int soNC;
	protected double donGiaNC;
	protected double thuong;
	public LaoDongPhoThong() {
		
	}
	public LaoDongPhoThong(String hoTen, String diaChi, String loaiLaoDong, int soNC, double donGiaNC, double thuong) {
		super(hoTen, diaChi, loaiLaoDong);
		this.soNC=soNC;
		this.donGiaNC=donGiaNC;
		this.thuong=thuong;
		
	}
	
	@Override 
	public void nhapTT() {
		super.nhapTT();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập số ngày công: ");
		this.soNC=input.nextInt();
		
		System.out.println("Nhập đơn giá ngày công: ");
		this.donGiaNC=input.nextDouble();
	}
		@Override 
	public double tinhLuong() {
		if(this.soNC>=25)
			this.thuong=1000000;
		else if(this.soNC>15)
			this.thuong=700000;
		else 
			this.thuong=0;
		
		return this.soNC*this.donGiaNC + this.thuong;
	}
	@Override
	public void inTT() {
		super.inTT();
		System.out.println("Số ngày công: "+ this.soNC);
		System.out.println("Đơn giá ngày công: " + this.donGiaNC);
		System.out.println("Thưởng: " + this.thuong);
	}

	
	
}
