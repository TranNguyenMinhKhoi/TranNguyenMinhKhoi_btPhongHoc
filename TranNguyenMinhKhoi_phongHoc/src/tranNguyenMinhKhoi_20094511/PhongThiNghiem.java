package tranNguyenMinhKhoi_20094511;

public class PhongThiNghiem extends PhongHoc{
	private String chuyenNganh, sucChua;
	private boolean bonRua;
	
	//dong goi
	public String getChuyenNganh() {
		return chuyenNganh;
	}


	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}


	public String getSucChua() {
		return sucChua;
	}


	public void setSucChua(String sucChua) {
		this.sucChua = sucChua;
	}


	public boolean isBonRua() {
		return bonRua;
	}


	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}

	
	
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBD, String chuyenNganh, String sucChua,
			boolean bonRua) throws Exception {
		super(maPhong, dayNha, dienTich, soBD);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBD) throws Exception {
		super(maPhong, dayNha, dienTich, soBD);
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		if (isBonRua() && duSang()) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String s3 = "";
		String datChuan = (datChuan())? "Phong dat chuan":"Phong khong dat chuan";
		String mayChieu = (isBonRua())? "Phong co bon rua":"Phong khong co bon rua";
		// TODO Auto-generated method stub
		return s3 + String.format("|%10s|%10s|", datChuan, isBonRua());
	}
}
