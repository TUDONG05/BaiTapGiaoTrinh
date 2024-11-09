package quan_ly_hoc_vien;
import java.util.Scanner;
public abstract class Hocvien {
	protected String name;
	protected String address;
	protected String typeProgram;
	protected int loaiUT;
	
	
	public Hocvien() {
		
	}
	
	public Hocvien(String name, String address, String typeProgram, int loaiUT) {
		this.name = name;
		this.address = address;
		this.typeProgram = typeProgram;
		this.loaiUT=loaiUT;
	}
	
	public abstract int hocPhi();
	
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.name=input.next();
		
		System.out.println("Nhap dia chi: ");
		this.address=input.next();
		
		System.out.println("Nhap loai chuong trinh: ");
		this.typeProgram=input.next();
		
		System.out.println("Nhap  loai uu tien: ");
		this.loaiUT=input.nextInt();
		
	}
	public void inTT() {
		System.out.println("Ho ten: " + this.name);
		System.out.println("Dia chi: " + this.address);
		System.out.println("Loai uu tien: " + this.loaiUT);
		System.out.println("Loai chuong trinh: " + this.typeProgram);
		System.out.println("Hoc phi: " + this.hocPhi());
	}
	
	
}
