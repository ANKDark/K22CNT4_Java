import java.util.Scanner;

public class Baimangsonguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        int n;
        int tong = 0;
        double tbc = 0;
        n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so phan tu thu: " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            tong += a[i];
        }

        tbc = (double) tong / n;
        System.out.println("Trung binh cong: " + tbc);

        System.out.println("Lap phuong cac phan tu:");
        for (int i = 0; i < n; i++) {
            int cube = a[i] * a[i] * a[i];
            System.out.println("Phan tu " + (i + 1) + ": " + cube);
        }
    }
}
