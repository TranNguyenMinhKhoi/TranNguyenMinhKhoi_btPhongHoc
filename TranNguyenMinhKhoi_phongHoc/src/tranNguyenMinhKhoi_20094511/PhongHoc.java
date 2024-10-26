package tranNguyenMinhKhoi_20094511;

import java.util.Objects;

public abstract class PhongHoc {
	//phuong thuc
		public abstract boolean datChuan();
		protected String maPhong, dayNha;
		protected double dienTich;
		protected int soBD;
		
		//dong goi
		public String getMaPhong() {
			return maPhong;
		}
		public void setMaPhong(String maPhong) throws Exception {
			if(maPhong != null) {
				this.maPhong = maPhong;
			}else {
				throw new Exception("Loi! Ma phong khong duoc rong!");
			}
		}
		public String getDayNha() {
			return dayNha;
		}
		public void setDayNha(String dayNha) {
			this.dayNha = dayNha;
		}
		public double getDienTich() {
			return dienTich;
		}
		public void setDienTich(double dienTich) throws Exception {
			if (dienTich > 0) {
				this.dienTich = dienTich;
			}else {
				throw new Exception("Loi! Dien tich phai >0");
			}
		}
		public int getSoBD() {
			return soBD;
		}
		public void setSoBD(int soBD) throws Exception {
			if (soBD > 0) {
				this.soBD = soBD;
			}else {
				throw new Exception("Loi! So bong den phai >0");
			}
		}
		public PhongHoc(String maPhong, String dayNha, double dienTich, int soBD) throws Exception {
			if(maPhong != null) {
				this.maPhong = maPhong;
			}else {
				throw new Exception("Loi! Ma phong khong duoc rong!");
			}
			this.dayNha = dayNha;
			this.dienTich = dienTich;
			if (soBD > 0) {
				this.soBD = soBD;
			}else {
				throw new Exception("Loi! So bong den phai >0");
			}
		}
		
		public boolean duSang() {
			if (getDienTich()/10 == getSoBD()) {
				return true;
			}else {
			return false;
			}
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			String duSang = duSang()? "Du anh sang" : "Khong du anh sang";
			String s = "";
			s+=s.format("|%10s|%10s|%10s|%10s|%10s|", getMaPhong(), getDayNha(), getDienTich(), getSoBD(), duSang());
			return s;
		}
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return Objects.hash(maPhong);
		}
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if (this == obj)
				return true;
			if (obj == null) {
				return false;
			}
			PhongHoc other = (PhongHoc) obj;
			return Objects.equals(maPhong, other.maPhong);
		}
}
