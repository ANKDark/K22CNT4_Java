import java.util.ArrayList;
import java.util.Scanner;

public class arrListBT3 {
    static Scanner sc = new Scanner(System.in);

    static void dsSoNguyen(ArrayList<Integer> lsn) {
        System.out.print("Nhap so phan tu: ");
        int sz = sc.nextInt();
        for (int i = 0; i < sz; i++) {
            System.out.printf("\nNhap phan tu thu %d: ", i + 1);
            lsn.add(sc.nextInt());
        }

        for (int i = 0; i < sz; i++) {
            System.out.printf("\nPhan tu thu %d co gia tri = %d", i + 1, lsn.get(i));
        }
    }

    static void ptLonHon5(ArrayList<Integer> lsn) {
        System.out.println("\nCac phan tu co gia tri lon hon 5:");
        for (int i = 0; i < lsn.size(); i++) {
            if (lsn.get(i) > 5) {
                System.out.printf("Phan tu thu %d co gia tri = %d\n", i + 1, lsn.get(i));
            }
        }
    }

    static void sapxepDS(ArrayList<Integer> lsn) {
        System.out.println("\nSap xep cac phan tu giam dan:");
        for (int i = 0; i < lsn.size(); i++) {
            for (int j = i + 1; j < lsn.size(); j++) {
                if (lsn.get(j) > lsn.get(i)) {
                    int temp = lsn.get(i);
                    lsn.set(i, lsn.get(j));
                    lsn.set(j, temp);
                }
            }
        }

        for (int i = 0; i < lsn.size(); i++) {
            System.out.printf("Phan tu thu %d co gia tri = %d\n", i + 1, lsn.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lsn = new ArrayList<>();
        dsSoNguyen(lsn);
        ptLonHon5(lsn);
        sapxepDS(lsn);
    }
}
