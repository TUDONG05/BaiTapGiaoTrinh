package benhnhan;
import java.util.Scanner;
public class BenhVien {
	private String ten;
	private String diaChi;
	private String giamDoc;
	
	public BenhVien() {
		
	}

	public BenhVien(String ten, String diaChi, String giamDoc) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}

	public String getTen() {
		return ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}

	public void nhapTT() {
		Scanner input =new Scanner(System.in);
		System.out.println("Nhap thong tin benh vien: ");
		System.out.println("Ten:");
		this.ten=input.next();
		
		System.out.println("Dia chi: ");
		this.diaChi=input.next();
		
		System.out.println("Giam doc: ");
		this.giamDoc=input.next();
	
		
	}
	@Override
	public String toString() {
		return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
	
	
	
}
