import java.util.Scanner;

public class KeThuaCanBo {
    private String maNV;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    static Scanner sc = new Scanner(System.in);

    public KeThuaCanBo() {
    }

    public KeThuaCanBo(String maNV, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.maNV = maNV;
        this.tuoi = tuoi;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getmaNV() {
        return maNV;
    }

    public void setmaNV(String maNV) {
        this.maNV = maNV;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int gettuoi() {
        return tuoi;
    }

    public void settuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getgioiTinh() {
        return gioiTinh;
    }

    public void setgioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getdiaChi() {
        return diaChi;
    }

    public void setdiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void xuatDuLieu() {
        System.out.printf("%-12s %-15s %-5s %-8s %-10s", maNV, hoTen, tuoi, gioiTinh, diaChi);
    }

    public void nhapDuLieu() {
        System.out.print("Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }
}
