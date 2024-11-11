package tinh_diem_sv;
import java.util.Scanner;
public abstract class Nguoi {
		protected String hoTen;
		protected String ngaySinh;
		protected String diaChi;
		protected String loaiSV;
		
		public Nguoi() {
			
		}

		public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSV) {
			this.hoTen = hoTen;
			this.ngaySinh = ngaySinh;
			this.diaChi = diaChi;
			this.loaiSV = loaiSV;
		}
		
		public void nhapThongTin() {
			Scanner input = new Scanner(System.in);
			System.out.println("Nhap ho ten: ");
			this.hoTen= input.next();
			
			System.out.println("Nhap ngay sinh: ");
			this.ngaySinh = input.next();
			
			System.out.println("Dia chi: ");
			this.diaChi = input.next();
			
			System.out.println("Loai sinh vien: ");
			this.loaiSV= input.next();
		}
		public abstract double tinhDiem();
		
		public void inThongTin() {
			System.out.println("Ho ten: " + this.hoTen);
			System.out.println("Ngay sinh: " +this.ngaySinh);
			System.out.println("Dia chi: " + this.diaChi);
			System.out.println("Loai sinh vien: " + this.loaiSV);
			System.out.println("DTB: " + this.tinhDiem());
			
		}
		
		
}
