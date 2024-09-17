package QLNV;

import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong nhan vien: ");
        n = sc.nextInt();

        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            NhanVien nv = new NhanVien();
            System.out.println("Nhap thong tin nhan vien thu: " + (i + 1) + ":");
            nv.inputNV();
            dsNhanVien.add(nv);
        }

        System.out.println("Danh sach nhan vien:");

        for (NhanVien nv : dsNhanVien) {
            System.out.println("Ma NV: " + nv.getMaNhanVien() + ", Ho ten: " + nv.gethoTen() + ", He so luong: "
                    + nv.getheSoLuong() + " Luong thuc te: " + nv.getheSoLuong() * 1800000);
        }
    }
}
