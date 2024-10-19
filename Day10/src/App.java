import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DienTu> listDienTu = new ArrayList<>();

        System.out.print("Nhap so luong mat hang dien tu: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin mat hang dien tu thu " + (i + 1));
            DienTu dt = new DienTu();
            dt.nhapDuLieu();
            listDienTu.add(dt);
        }
        int soLoaiHang = n;
        int[] tongLoai = new int[soLoaiHang];

        for (DienTu dt : listDienTu) {
            if (dt.getmthoiGianBH() >= 12) {
                int loaiHang = dt.getLoaiHang();
                if (loaiHang >= 0 && loaiHang < soLoaiHang) {
                    tongLoai[loaiHang] += dt.getSoLuong();
                }
            }
        }

        System.out.println("Tong so luong loai hang bao hanh >= 12 thang:");
        for (int i = 0; i < soLoaiHang; i++) {
            if (tongLoai[i] > 0) {
                System.out.println("Loai hang " + i + ": " + tongLoai[i] + " san pham");
            }
        }

        System.out.print("Nhap ten mat hang can tim: ");
        String tenCanTim = sc.nextLine();
        boolean timThay = false;
        for (DienTu dt : listDienTu) {
            if (dt.gettenHang().equalsIgnoreCase(tenCanTim)) {
                System.out.println("Mat hang duoc tim thay: ");
                dt.xuatDuLieu();
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay mat hang voi ten: " + tenCanTim);
        }

        DienTu maxSoLuong = listDienTu.get(0);
        for (DienTu dt : listDienTu) {
            if (dt.getSoLuong() > maxSoLuong.getSoLuong()) {
                maxSoLuong = dt;
            }
        }
        System.out.println("Mat hang co so luong nhieu nhat: ");
        maxSoLuong.xuatDuLieu();
    }
}
