package QLNV;

import java.util.Scanner;

public class NhanVien {
    private int maNhanVien;
    private String hoTen;
    private int heSoLuong;
    static Scanner sc = new Scanner(System.in);

    public void setmaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void sethoTen(String hoTen) {
        if (hoTen.length() > 50) {
            this.hoTen = hoTen.substring(0, 49);
        } else {
            this.hoTen = hoTen;
        }
    }

    public String gethoTen() {
        return hoTen;
    }

    public void setheSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getheSoLuong() {
        return heSoLuong;
    }

    public void inputNV() {
        System.out.print("Nhap ma nhan vien: ");
        maNhanVien = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextInt();
    }
}
