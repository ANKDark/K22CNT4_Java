import java.util.Scanner;

public class KeThuaNhanVien extends KeThuaCanBo {
    private String congViec;

    public KeThuaNhanVien() {
    }

    public KeThuaNhanVien(String maNV, String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(maNV, hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getcongViec() {
        return congViec;
    }

    public void setcongViec(String congViec) {
        this.congViec = congViec;
    }

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        super.nhapDuLieu();
        System.out.print("Cong viec: ");
        congViec = sc.nextLine();
    }

    public void xuatDuLieu() {
        super.xuatDuLieu();
        System.out.println(congViec);
    }
}
