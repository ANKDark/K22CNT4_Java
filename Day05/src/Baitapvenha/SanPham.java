package Baitapvenha;

import java.util.Scanner;

public class SanPham {
    // Bài 2. Xây dựng lớp Sản phẩm gồm
    // - Các trường dữ liệu Mã sản phẩm, tên sản phẩm, hãng sản xuất, số lượng, đơn
    // giá.
    private int maSP;
    private String tenSP;
    private String hangSX;
    private int soLuong;
    private double donGia;
    static Scanner sc = new Scanner(System.in);

    // - Các phương thức getter và setter tương ứng với các trường dữ liệu
    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }

    // -Hàm tạo có tham số và hàm tạo không có tham số
    public SanPham() {
        maSP = 0;
        tenSP = "";
        hangSX = "";
        soLuong = 0;
        donGia = 0;
    }

    public SanPham(int maSP, int soLuong, String tenSP, String hangSX, double donGia) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.hangSX = hangSX;
    }

    // -Các phương thức: nhập, xuất
    public void nhapDuLieu() {
        System.out.print("Nhap ma san pham: ");
        maSP = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine();

        System.out.print("Nhap hang san xuat: ");
        hangSX = sc.nextLine();

        System.out.print("Nhap so luong san pham: ");
        soLuong = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
    }

    public void xuatDuLieu() {
        System.out.printf("%-30s%-30s%-30s%-30s%-50s%n", "Ma san pham", "Ten san pham", "So luong", "Hang san xuat",
                "Don gia");
        System.out.printf("%-30d%-30s%-30d%-30s%-50.2f%n", maSP, tenSP, soLuong, hangSX, donGia);
    }

    // -Phương thức tính thành tiền = số lượng * đơn giá
    public double tinhTien() {
        return soLuong * donGia;
    }

}
