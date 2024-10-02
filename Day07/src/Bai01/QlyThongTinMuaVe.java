package Bai01;

import java.util.Scanner;

public class QlyThongTinMuaVe {
    private String hoVaTen;
    private double giaVe;

    static Scanner sc = new Scanner(System.in);

    public QlyThongTinMuaVe() {

    }

    public QlyThongTinMuaVe(String hoVaTen, double giaVe) {
        this.hoVaTen = hoVaTen;
        this.giaVe = giaVe;
    }

    public void sethoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String gethoVaTen() {
        return hoVaTen;
    }

    public void setgiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public double getgiaVe() {
        return giaVe;
    }

    public void xuatDL() {
        System.out.printf("%-10s %-10s", hoVaTen, giaVe);
    }

    public void nhapDL() {
        System.out.print("Nhap ho va ten: ");
        hoVaTen = sc.nextLine();
    }

}
