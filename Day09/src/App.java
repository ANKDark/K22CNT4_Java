import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Nguoi> dsNguoi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguoi: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao nguoi thu " + (i + 1));
            Nguoi nguoi = new Nguoi();
            try {
                System.out.print("\nNhap ma: ");
                nguoi.setma(sc.nextLine());
                System.out.print("Nhap ho ten: ");
                nguoi.sethoTen(sc.nextLine());
                System.out.print("Nhap tuoi: ");
                nguoi.settuoi(sc.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Loi: " + e.getMessage());
                System.out.println("Moi nhap lai ng thu " + (i + 1));
                i--;
            }
        }

    }
}
