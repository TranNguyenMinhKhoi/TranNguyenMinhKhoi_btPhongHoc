package tranNguyenMinhKhoi_20094511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListPhongHoc {
	List<PhongHoc> ls;
	public ListPhongHoc() {
		ls = new ArrayList<PhongHoc>(2);
	}
	//them phong
	public boolean themPhong(PhongHoc p) {
		if (ls.contains(p)) {
			return false;
		}else {
			return true;
		}
	}
	
	public int soPhongHoc() {
		return ls.size();
	}
	
	//xoa phong
	public boolean xoaPhong(String maXoa) {
		for (PhongHoc ph : ls)
			if (ph.getMaPhong().equalsIgnoreCase(maXoa)) {
				ls.remove(ph);
				return true;
			}
		return false;
	}
	
	//xuat toan bo danh sach phong
	public List<PhongHoc> xuatDSP() {
		return ls;
	}
	
	//xuat danh sach phong hoc dat chuan
	public List<PhongHoc> xuatDSPChuan(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		for (PhongHoc ph : ls)
			if (ph.datChuan())
				dsDC.add(ph);
		return dsDC;
	}
	// sap xep
	public void SapXep() {
		Collections.sort(ls, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				String x = new String(o1.getMaPhong());
				String y = new String(o2.getMaPhong());
				return x.compareToIgnoreCase(y);
			}

		});
	}
	//
	public boolean soBongDen(String maPhong, int soBong) throws Exception {
		for (PhongHoc ph : ls)
			if (maPhong.equalsIgnoreCase(ph.getMaPhong())) {
				ph.setSoBD(soBong);
				return true;
			}
		return false;
	}
}
