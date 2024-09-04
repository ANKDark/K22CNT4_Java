import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class arrListBT2 {
    static Scanner sc = new Scanner(System.in);

    static void cauhoiList(ArrayList<String> lch) {
        System.out.println("Danh sach 5 cau hoi: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nNhap cau hoi thu %d: ", i + 1);
            lch.add(sc.nextLine());
        }
    }

    static void randomCH(ArrayList<String> lch) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(lch.size());
            System.out.println("\nCau hoi ngau nhien: " + lch.get(index));
            lch.remove(index);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lch = new ArrayList<>();
        cauhoiList(lch);
        randomCH(lch);
    }
}
