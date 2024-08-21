import java.util.Scanner;

public class Bai03_IF {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sodien;
        double tiendien;
        System.out.println("Mời nhập số KW: ");
        sodien = sc.nextInt();

        if (sodien <= 100) {
            tiendien = 550 * sodien;
        } else if (sodien <= 150) {
            tiendien = (100 * 550) + ((sodien - 100) * 750);
        } else if (sodien <= 200) {
            tiendien = (100 * 550) + (50 * 750) + ((sodien - 150) * 950);
        } else {
            tiendien = (100 * 550) + (50 * 750) + (50 * 950) + ((sodien - 200) * 1350);
        }
        tiendien = tiendien * 1.1;
        System.out.println("Tổng số tiền điện phải trả là: " + tiendien);
    }
}
