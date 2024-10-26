package tranNguyenMinhKhoi_20094511;

public class PhongLyThuyet extends PhongHoc {
	private boolean mayChieu;
	//dong goi
	public boolean isMayChieu() {
		return mayChieu;
	}
	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	
	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBD) throws Exception {
		super(maPhong, dayNha, dienTich, soBD);
		// TODO Auto-generated constructor stub
	}
	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBD, boolean mayChieu) throws Exception {
		super(maPhong, dayNha, dienTich, soBD);
		this.mayChieu = mayChieu;
	}
	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		if (isMayChieu() && duSang()) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String s1 = "";
		String datChuan = (datChuan())? "Phong dat chuan":"Phong khong dat chuan";
		String mayChieu = (isMayChieu())? "Phong co may chieu":"Phong khong co may chieu";
		// TODO Auto-generated method stub
		return s1 + String.format("|%10s|%10s|", datChuan, mayChieu);
	}
}
