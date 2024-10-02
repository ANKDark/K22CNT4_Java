package Bai01;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<QlyThongTinMuaVe> dsqlys = new ArrayList<>();

        System.out.print("Nhap so khach hang: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap khach hang thu " + (i + 1) + ": ");
            System.out.print("Nguoi lon (1)\nTre em (2)\n");
            int luaChon = sc.nextInt();
            sc.nextLine();

            if (luaChon == 1) {
                QlyThongTinMuaVe ql = new NguoiLon();
                ql.nhapDL();
                dsqlys.add(ql);
            } else if (luaChon == 2) {
                QlyThongTinMuaVe ql = new TreEm();
                ql.nhapDL();
                dsqlys.add(ql);
            } else {
                System.out.println("Nhap sai thong tin!");
            }
        }

        System.out.println("\nDanh sach khach hang:");
        for (QlyThongTinMuaVe ql : dsqlys) {
            ql.xuatDL();
            System.out.println();
        }
    }
}
