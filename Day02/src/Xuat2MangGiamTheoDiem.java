import java.util.Locale;
import java.util.Scanner;

public class Xuat2MangGiamTheoDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = sc.nextInt();

        String[] hoTen = new String[soLuong];
        Double[] Diem = new Double[soLuong];

        sc.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhap ho ten sinh vien thu " + (i + 1) + ": ");
            hoTen[i] = sc.nextLine();

            System.out.print("Nhap diem cua sinh vien thu " + (i + 1) + ": ");
            Diem[i] = sc.nextDouble();

            sc.nextLine();
        }

        for (int i = 0; i < soLuong; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (Diem[j] > Diem[i]) {
                    Double tempDiem = Diem[i];
                    Diem[i] = Diem[j];
                    Diem[j] = tempDiem;

                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                }
            }
        }

        System.out.println("Danh sach sinh vien va diem theo thu tu giam dan:");
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Sinh vien: " + hoTen[i] + ", Diem: " + Diem[i]);
        }
    }
}
