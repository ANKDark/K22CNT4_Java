package Bai02;

import java.util.Scanner;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<QlyCH> dsqlychs = new ArrayList<>();

        System.out.print("Nhap so can ho: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap can ho thu " + (i + 1) + ": ");
            System.out.print("Can ho VIP (1)\nCan ho Basic (2)\n");
            int luaChon = sc.nextInt();
            sc.nextLine();

            if (luaChon == 1) {
                QlyCH ql = new CanHoVIP();
                ql.nhapDL();
                dsqlychs.add(ql);
            } else if (luaChon == 2) {
                QlyCH ql = new CanHoBasic();
                ql.nhapDL();
                dsqlychs.add(ql);
            } else {
                System.out.println("Nhap sai thong tin!");
            }
        }
        System.out.println("\nDanh sach can ho:");
        for (QlyCH ql : dsqlychs) {
            ql.xuatDL();
            System.out.println();
        }

    }
}
