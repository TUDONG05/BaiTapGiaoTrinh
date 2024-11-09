package quan_ly_hoc_vien;
import java.util.Scanner;
public class HocvienDH extends Hocvien{
	protected int soBuoi;
	protected int donGia;
	protected int uuTien;
	public HocvienDH() {
		
	}
	
	public HocvienDH(String name, String address, String typeProgram, int loaiUT, int soBuoi, int donGia,int uuTien) {
		super(name, address, typeProgram, loaiUT);
		this.soBuoi=soBuoi;
		this.donGia=donGia;
		this.uuTien=uuTien;
		
	}
	
	@Override
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap so buoi: ");
		this.soBuoi=input.nextInt();
		
		System.out.println("Nhap don gia: ");
		this.donGia= input.nextInt();		
	}
	@Override
	public int hocPhi() {
		if(this.loaiUT==1)
			this.uuTien=1000000;
		else if(this.loaiUT ==2)
			this.uuTien=500000;
		return this.soBuoi * this.donGia -this.uuTien;
	}

}
