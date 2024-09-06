package QLSV;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private int diem;
    static Scanner sc = new Scanner(System.in);

    public void sethoTen(String hoTen) {
        if (hoTen.length() > 50) {
            this.hoTen = hoTen.substring(0, 49);
        } else {
            this.hoTen = hoTen;
        }
    }

    public String gethoTen() {
        return hoTen;
    }

    public void setdiem(int diem) {
        if (diem > 10) {
            this.diem = 10;
        } else if (diem < 0) {
            this.diem = 0;
        } else {
            this.diem = diem;
        }
    }

    public int getdiem() {
        return diem;
    }

    public void inputSV() {
        System.out.print("Nhap ho ten");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem");
        diem = sc.nextInt();
    }
}
