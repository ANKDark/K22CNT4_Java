// Bài 3: Nhập vào một số nguyên (có 4 chữ số). In ra tổng của 4 chữ số này và chữ số đầu, chữ số cuối (ví
// dụ số 3456 có tổng các chữ số là 18, đầu và cuối là 3 và 6, kết quả in ra là: 18, 3, 6).

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số có 4 chữ số");
        int n, dau, cuoi, tong;
        n = sc.nextInt();
        if (n < 999 && n > 9999) {
            System.out.println("Mời nhập lại n có 4 chữ số");
            n = sc.nextInt();
        }
        dau = n / 1000;
        cuoi = (n % 10);
        tong = ((n % 100) / 10) + ((n / 1000)) + ((n % 10)) + ((n % 1000) / 100);
        System.out.println("Tổng = " + tong);
        System.out.println("Số đầu = " + dau);
        System.out.println("Số cuối = " + cuoi);
    }
}
