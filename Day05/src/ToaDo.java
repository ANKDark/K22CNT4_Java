import java.util.Scanner;

public class ToaDo {
    // Trường dữ liệu hoành độ và tung độ
    private double toadoX;
    private double toadoY;
    static Scanner sc = new Scanner(System.in);

    // Thuộc tính hoành độ, tung độ
    public void settoadoX(double toadoX) {
        this.toadoX = toadoX;
    }

    public void settoadoY(double toadoY) {
        this.toadoY = toadoY;
    }

    public double gettoadoX() {
        return toadoX;
    }

    public double gettoadoY() {
        return toadoY;
    }

    // Hàm tạo có tham số và hàm tạo không có tham số
    public ToaDo() {
        toadoX = 0;
        toadoY = 0;
    }

    public ToaDo(double toadoX, double toadoY) {
        this.toadoX = toadoX;
        this.toadoY = toadoY;
    }

    // Phương thức nhập dữ liệu
    public void inputPoint() {
        System.out.print("Nhap toa do X: ");
        toadoX = sc.nextDouble();
        System.out.print("Nhap toa do Y: ");
        toadoY = sc.nextDouble();
    }

    // Hàm tính khoảng cách từ điểm đến gốc tọa độ
    public double diemDenGocToaDo() {
        return Math.sqrt(Math.pow(toadoX, 2) + Math.pow(toadoY, 2));
    }

    // Hàm tính khoảng cách giữa hai điểm
    public double khoangCachGiuaHaiDiem(ToaDo other) {
        return Math.sqrt(Math.pow(other.gettoadoX() - this.toadoX, 2) + Math.pow(other.gettoadoY() - this.toadoY, 2));
    }

    // Hàm xuất thông tin bao gồm hoành độ, tung độ, khoảng cách đến gốc tọa độ
    public void xuatThongTin() {
        int columnWidth = 30;

        // In tiêu đề cột, căn phải
        System.out.printf("%" + columnWidth + "s%" + columnWidth + "s%" + (columnWidth + 20) + "s%n",
                "Toa do X", "Toa do Y", "Khoang cach den goc toa do");

        // In giá trị, căn phải
        System.out.printf(
                "%" + (columnWidth - 2) + ".2f%" + (columnWidth - 1) + ".2f%" + (columnWidth + 13) + ".2f%n",
                toadoX, toadoY, diemDenGocToaDo());
    }

}
