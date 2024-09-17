import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng điểm
        System.out.print("Nhap so luong toa do muon co: ");
        int n = sc.nextInt();

        ArrayList<ToaDo> dsToaDo = new ArrayList<>();

        // Nhập các điểm và thêm vào danh sách
        for (int i = 0; i < n; i++) {
            ToaDo td = new ToaDo();
            System.out.println("Nhap thong tin toa do thu: " + (i + 1) + ":");
            td.inputPoint();
            dsToaDo.add(td);
        }

        // In danh sách các điểm
        System.out.printf("%-20s%-20s%-20s%n", "Toa do X", "Toa do Y", "Khoang cach den goc toa do");
        double tongKhoangCachDenGoc = 0;
        ToaDo diemGanGocNhat = dsToaDo.get(0);

        for (ToaDo td : dsToaDo) {
            double khoangCachDenGoc = td.diemDenGocToaDo();
            tongKhoangCachDenGoc += khoangCachDenGoc;

            // In thông tin điểm
            System.out.printf("%-20.2f%-20.2f%-20.2f%n",
                    td.gettoadoX(), td.gettoadoY(), khoangCachDenGoc);

            // Tìm điểm gần gốc tọa độ nhất
            if (khoangCachDenGoc < diemGanGocNhat.diemDenGocToaDo()) {
                diemGanGocNhat = td;
            }
        }

        // In tổng khoảng cách của các điểm đến gốc tọa độ
        System.out.println("\nTong khoang cach den goc toa do: " + tongKhoangCachDenGoc);

        // In điểm gần gốc tọa độ nhất
        System.out.println("Diem gan goc toa do nhat:");
        for (ToaDo td : dsToaDo) {
            if (td.diemDenGocToaDo() == diemGanGocNhat.diemDenGocToaDo()) {
                diemGanGocNhat.xuatThongTin();
            }
        }
        sc.close();
    }
}
