package Bai02;

import java.util.Scanner;

public class QlyCH {
    // ID, Area (diện tích), Floor (Tầng), giaSan (Giá).
    private int iD;
    private double area;
    private int floor;
    private double giaSan;
    static Scanner sc = new Scanner(System.in);

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getiD() {
        return iD;
    }

    public void setarea(double area) {
        this.area = area;
    }

    public double getarea() {
        return area;
    }

    public void setfloor(int floor) {
        this.floor = floor;
    }

    public int getfloor() {
        return floor;
    }

    public void setgiaSan(double giaSan) {
        this.giaSan = giaSan;
    }

    public double getgiaSan() {
        return giaSan;
    }

    public void xuatDL() {
        System.out.printf("%-10s %-10s %-10s %-10s", iD, area, floor, giaSan);
    }

    public void nhapDL() {

        System.out.print("Ma so can ho: ");
        iD = sc.nextInt();
        System.out.print("Dien tich can ho: ");
        area = sc.nextDouble();
        System.out.print("Tang can ho: ");
        floor = sc.nextInt();
        System.out.print("Gia can ho: ");
        giaSan = sc.nextDouble();
    }
}
