import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<KeThuaCanBo> dsCanBos = new ArrayList<>();
        System.out.print("So can bo trong don vi: ");
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap nguoi thu " + (i + 1) + ":");
            System.out.print("\nKy su (1)\nNhan Vien (2)\n");
            int luaChon;
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                KeThuaCanBo cb = new KeThuaKySu();
                cb.nhapDuLieu();
                dsCanBos.add(cb);
            } else if (luaChon == 2) {
                KeThuaCanBo cb = new KeThuaNhanVien();
                cb.nhapDuLieu();
                dsCanBos.add(cb);
            } else {
                System.out.println("Nhap sai du lieu roi nhe");
                break;
            }
        }
        for (KeThuaCanBo cb : dsCanBos) {
            cb.xuatDuLieu();
        }
        sc.close();
    }
}
