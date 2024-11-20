package bai2;
public class ThoiGian {
	protected int ngay;
	protected int thang;
	protected int nam;
	
	
	public ThoiGian() {
		
	}


	public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
		if(ngay< 0 || thang<0 ||nam<0||ngay >31 || thang>12)
		throw new InvalidDateException("Ngay thang khong hop le!");
		else {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		}
		
		
		
	}
	
	
}
