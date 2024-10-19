import java.util.Scanner;

public class QLyHang {
    /*
     * Xây dựng lớp QLH (quản lý hàng), gồm các thuộc tính (private): mã hàng, tên
     * hàng, xuất xứ, loại hàng(1, 2, 3),
     * số lượng; các phương thức (public): nhập, xuất, và các phương thức khác (nếu
     * cần).
     */
    private String maHang;
    private String tenHang;
    private String xuatXu;
    private int loaiHang;
    private int soLuong;
    static Scanner sc = new Scanner(System.in);

    public void setmaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getmaHang() {
        return maHang;
    }

    public void settenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String gettenHang() {
        return tenHang;
    }

    public void setxuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getxuatXu() {
        return xuatXu;
    }

    public int getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(int loaiHang) {
        this.loaiHang = loaiHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void xuatDuLieu() {
        System.out.printf("%-12s %-15s %-12s %-10 %-10", maHang, tenHang, xuatXu, loaiHang, soLuong);
    }

    public void nhapDuLieu() {
        System.out.print("Nhap ma: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten: ");
        tenHang = sc.nextLine();
        System.out.print("Xuat xu: ");
        xuatXu = sc.nextLine();
        System.out.print("Loai hang: ");
        loaiHang = sc.nextInt();
        sc.nextLine();
        System.out.print("So luong: ");
        soLuong = sc.nextInt();
    }
}
