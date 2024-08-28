public class TBCSoChiaHetCho3 {
    public static void main(String[] args) {
        int count = 0, n = 3, tong = 0;
        double tbc;
        for (int i = 27; i <= 250; i++) {
            if (i % n == 0) {
                tong += i;
                count++;
            }
        }
        tbc = (double) tong / count;
        System.out.println("Trung binh cong cac so chia het cho 3 la: " + tbc);
    }
}
