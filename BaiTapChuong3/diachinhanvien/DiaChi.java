package diachinhanvien;
public class DiaChi {
	//dinh nghia cac thuoc tinh
		private String thon;
		private String xa;
		private String huyen;
		private String tinh;
		//constructors
		public DiaChi(String thon, String xa, String huyen, String tinh) {
			this.thon = thon;
			this.xa = xa;
			this.huyen = huyen;
			this.tinh = tinh;
		}
		
		
		public DiaChi() {
		}


		//getter
		public String getThon() {
			return thon;
		}
		
		public String getXa() {
			return xa;
		}
		public String getHuyen() {
			return huyen;
		}
		public String getTinh() {
			return tinh;
		}
		
		//setter
		public void setThon(String thon) {
			this.thon = thon;
		}
		public void setXa(String xa) {
			this.xa = xa;
		}
		public void setHuyen(String huyen) {
			this.huyen = huyen;
		}
		public void setTinh(String tinh) {
			this.tinh = tinh;
		}
		@Override
		public String toString() {
			return "Thon: "+this.thon +
					", Xa: "+this.xa +
					", Huyen: "+this.huyen +
					", Tinh: "+this.tinh;
		}
		
	}
