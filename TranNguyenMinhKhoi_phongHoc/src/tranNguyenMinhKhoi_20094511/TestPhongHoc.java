package tranNguyenMinhKhoi_20094511;

import java.util.List;
import java.util.Scanner;

public class TestPhongHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListPhongHoc listPhongHoc = new ListPhongHoc();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Xóa phòng học theo mã");
            System.out.println("3. Xuất toàn bộ danh sách phòng");
            System.out.println("4. Xuất danh sách phòng học đạt chuẩn");
            System.out.println("5. Sắp xếp danh sách theo mã phòng");
            System.out.println("6. Cập nhật số bóng đèn theo mã phòng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    themPhongHoc(listPhongHoc, scanner);
                    break;
                case 2:
                    xoaPhongHoc(listPhongHoc, scanner);
                    break;
                case 3:
                    xuatDanhSachPhongHoc(listPhongHoc);
                    break;
                case 4:
                    xuatDanhSachPhongDatChuan(listPhongHoc);
                    break;
                case 5:
                    listPhongHoc.SapXep();
                    System.out.println("Đã sắp xếp danh sách phòng học.");
                    break;
                case 6:
                    capNhatSoBongDen(listPhongHoc, scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void themPhongHoc(ListPhongHoc listPhongHoc, Scanner scanner) {
        try {
            System.out.print("Nhập mã phòng: ");
            String maPhong = scanner.next();
            System.out.print("Nhập dãy nhà: ");
            String dayNha = scanner.next();
            System.out.print("Nhập diện tích: ");
            double dienTich = scanner.nextDouble();
            System.out.print("Nhập số bóng đèn: ");
            int soBD = scanner.nextInt();

            System.out.println("Chọn loại phòng:");
            System.out.println("1. Phòng lý thuyết");
            System.out.println("2. Phòng thí nghiệm");
            System.out.println("3. Phòng máy tính");
            int loaiPhong = scanner.nextInt();

            PhongHoc phongHoc;
            switch (loaiPhong) {
                case 1:
                    System.out.print("Phòng có máy chiếu không (true/false): ");
                    boolean mayChieu = scanner.nextBoolean();
                    phongHoc = new PhongLyThuyet(maPhong, dayNha, dienTich, soBD, mayChieu);
                    break;
                case 2:
                    System.out.print("Nhập chuyên ngành: ");
                    String chuyenNganh = scanner.next();
                    System.out.print("Nhập sức chứa: ");
                    String sucChua = scanner.next();
                    System.out.print("Phòng có bồn rửa không (true/false): ");
                    boolean bonRua = scanner.nextBoolean();
                    phongHoc = new PhongThiNghiem(maPhong, dayNha, dienTich, soBD, chuyenNganh, sucChua, bonRua);
                    break;
                case 3:
                    System.out.print("Nhập số máy tính: ");
                    int soMay = scanner.nextInt();
                    phongHoc = new PhongMayTinh(maPhong, dayNha, dienTich, soBD, soMay);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    return;
            }

            if (listPhongHoc.themPhong(phongHoc)) {
                System.out.println("Thêm phòng học thành công.");
            } else {
                System.out.println("Phòng học đã tồn tại.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void xoaPhongHoc(ListPhongHoc listPhongHoc, Scanner scanner) {
        System.out.print("Nhập mã phòng cần xóa: ");
        String maXoa = scanner.next();
        if (listPhongHoc.xoaPhong(maXoa)) {
            System.out.println("Xóa phòng học thành công.");
        } else {
            System.out.println("Không tìm thấy phòng học với mã đã nhập.");
        }
    }

    public static void xuatDanhSachPhongHoc(ListPhongHoc listPhongHoc) {
        List<PhongHoc> danhSach = listPhongHoc.xuatDSP();
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách phòng học trống.");
        } else {
            System.out.println("--- Danh sách phòng học ---");
            for (PhongHoc ph : danhSach) {
                System.out.println(ph);
            }
        }
    }

    public static void xuatDanhSachPhongDatChuan(ListPhongHoc listPhongHoc) {
        List<PhongHoc> danhSachChuan = listPhongHoc.xuatDSPChuan();
        if (danhSachChuan.isEmpty()) {
            System.out.println("Không có phòng học đạt chuẩn.");
        } else {
            System.out.println("--- Danh sách phòng học đạt chuẩn ---");
            for (PhongHoc ph : danhSachChuan) {
                System.out.println(ph);
            }
        }
    }

    public static void capNhatSoBongDen(ListPhongHoc listPhongHoc, Scanner scanner) {
        try {
            System.out.print("Nhập mã phòng cần cập nhật: ");
            String maPhong = scanner.next();
            System.out.print("Nhập số bóng đèn mới: ");
            int soBong = scanner.nextInt();
            if (listPhongHoc.soBongDen(maPhong, soBong)) {
                System.out.println("Cập nhật số bóng đèn thành công.");
            } else {
                System.out.println("Không tìm thấy phòng học với mã đã nhập.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
	}
}
