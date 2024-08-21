import java.util.Scanner;

public class Bai06_IF {

    static double tinhTienLuong(int luong) {
        double luongThucTe;

        if (luong < 7000000) {
            luongThucTe = luong - luong * 0.1;
        } else if (luong <= 15000000) {
            luongThucTe = luong - luong * 0.22;
        } else {
            luongThucTe = luong - luong * 0.33;
        }

        return luongThucTe;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luong;
        System.out.println("Nhap luong cua ban: ");
        luong = sc.nextInt();

        double luongThucTe = tinhTienLuong(luong);

        System.out.println("Luong thuc te: " + luongThucTe);
    }
}
