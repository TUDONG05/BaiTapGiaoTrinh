package sinhvien;
import java.util.Scanner;
	public class Nguoi {
		protected String ten;
		protected int tuoi;
		protected char gioiTinh;
		
		public Nguoi(String ten, int tuoi, char gioiTinh) {
			this.ten = ten;
			this.tuoi = tuoi;
			this.gioiTinh = gioiTinh;
		}
		
		public Nguoi() {
			
		}

		public String getTen() {
			return ten;
		}

		public int getTuoi() {
			return tuoi;
		}

		public char getGioiTinh() {
			return gioiTinh;
		}

		public void setTen(String ten) {
			this.ten = ten;
		}

		public void setTuoi(int tuoi) {
			this.tuoi = tuoi;
		}

		public void setGioiTinh(char gioiTinh) {
			this.gioiTinh = gioiTinh;
		}
		
		
		public void nhapTT() {
			Scanner input = new Scanner(System.in);
			System.out.println("Ten: ");
			this.ten=input.next();
			
			System.out.println("Tuoi: ");
			this.tuoi=input.nextInt();
			
			System.out.println("Gioi tinh: ");
			this.gioiTinh=input.next().charAt(0);
		}
		
		@Override
		public String toString() {
			return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
		}
		
		



	}


