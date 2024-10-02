import java.util.Scanner;

public class KeThuaKySu extends KeThuaCanBo {
    private String nganhDaoTao;

    public KeThuaKySu() {
    }

    public KeThuaKySu(String maNV, String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(maNV, hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getnganhDaoTao() {
        return nganhDaoTao;
    }

    public void setnganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        super.nhapDuLieu();
        System.out.print("Nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
    }

    public void xuatDuLieu() {
        super.xuatDuLieu();
        System.out.println(nganhDaoTao);
    }
}
