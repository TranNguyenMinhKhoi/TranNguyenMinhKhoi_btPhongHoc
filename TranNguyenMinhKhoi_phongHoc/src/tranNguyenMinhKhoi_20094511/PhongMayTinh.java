package tranNguyenMinhKhoi_20094511;

public class PhongMayTinh extends PhongHoc {
	private int soMay;
	
	//dong goi
	public int getSoMay() {
		return soMay;
	}

	public void setSoMay(int soMay) throws Exception {
		if (soMay > 0) {
			this.soMay = soMay;
		}else {
			throw new Exception("Loi! So may phai > 0");
		}
	}
	
	
	
	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBD, int soMay) throws Exception {
		super(maPhong, dayNha, dienTich, soBD);
		this.soMay = soMay;
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBD) throws Exception {
		super(maPhong, dayNha, dienTich, soBD);
		// TODO Auto-generated constructor stub
	}

	public boolean mayTinh() {
		if (soMay == getDienTich()/1.5) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		if (mayTinh() && duSang()) {
			return true;
		}else {
			return false;
		}
	}
	

	@Override
	public String toString() {
		String s2 = "";
		String datChuan = (datChuan())? "Phong dat chuan":"Phong khong dat chuan";
		String mayChieu = (mayTinh())? "Phong du may tinh":"Phong khong du may tinh";
		// TODO Auto-generated method stub
		return s2 + String.format("|%10s|%10s|", datChuan, mayTinh());
	}
}
