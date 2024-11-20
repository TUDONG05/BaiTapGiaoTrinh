package bai2_1;
import java.util.Scanner;
public class ThoiGian {
	protected int ngay;
	protected int thang;
	protected int nam;
	
	public ThoiGian() {
		
	}
	
	public ThoiGian(int ngay,int thang,int nam) throws InvalidDateException {
		if(ngay< 0 || thang<0 ||nam<0||ngay >31 || thang>12 )
			throw new InvalidDateException("Loi nhap ngay thang!");
		else {
			this.ngay=ngay;
			this.thang=thang;
			this.nam=nam;
			
		}
		
	}
	
	public void nhap() throws InvalidDateException {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ngay:");
		this.ngay=input.nextInt();
		
		System.out.println("Nhap thang:");
		this.thang=input.nextInt();
		System.out.println("Nhap nam:");
		this.nam=input.nextInt();
		if(ngay< 0 || thang<0 ||nam<0||ngay >31 || thang>12 )
			throw new InvalidDateException("Loi nhap ngay thang!");
		
	}
	public void inTT() {
		System.out.println(this.ngay+"/"+this.thang+"/"+this.nam);
	}
}
