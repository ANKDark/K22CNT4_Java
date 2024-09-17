package Baitapvenha;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Trong hàm main
        // -Nhập List n sản phẩm
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong san pham: ");
        int n = sc.nextInt();

        ArrayList<SanPham> dsSanPhams = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SanPham sp = new SanPham();
            System.out.println("Nhap san pham thu: " + (i + 1));
            sp.nhapDuLieu();
            dsSanPhams.add(sp);
        }

        // -In danh sách n sản phẩm
        for (SanPham sp : dsSanPhams) {
            sp.xuatDuLieu();
        }
        // -Tìm ra các sản phẩm có thành tiền nằm trong khoảng
        System.out.print("Nhap gia bat dau: ");
        double giaBatDau = sc.nextDouble();

        System.out.print("Nhap gia ket thuc: ");
        double giaKetThuc = sc.nextDouble();

        System.out.println("San pham trong khoang gia:");
        for (SanPham sp : dsSanPhams) {
            double thanhTien = sp.tinhTien();
            if (thanhTien >= giaBatDau && thanhTien <= giaKetThuc) {
                sp.xuatDuLieu();
            }
        }

        // -Sắp xếp danh sách theo chiều tăng dần của thành tiền
        Collections.sort(dsSanPhams, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham sp1, SanPham sp2) {
                return Double.compare(sp1.tinhTien(), sp2.tinhTien());
            }
        });

        // Output sorted product list
        System.out.println("Danh sach san pham sau khi sap xep theo thanh tien:");
        for (SanPham sp : dsSanPhams) {
            sp.xuatDuLieu();
        }

        sc.close();
    }
}
