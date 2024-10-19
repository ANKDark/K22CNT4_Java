public class DienTu extends QLyHang {
    private int thoiGianBH;

    public void setthoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public int getmthoiGianBH() {
        return thoiGianBH;
    }

    public void xuatDuLieu() {
        super.xuatDuLieu();
        System.out.printf("%-10", thoiGianBH);
    }

    public void nhapDuLieu() {
        super.nhapDuLieu();
        System.out.print("Thoi gian bao hanh");
        thoiGianBH = sc.nextInt();
    }
}
