import java.util.ArrayList;
import java.util.Scanner;

public class arrListBT1 {
    static Scanner sc = new Scanner(System.in);

    static void inputList(ArrayList<Double> lst) {
        System.out.print("Nhap so phan tu: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.printf("\nNhap phan tu thu %d: ", i + 1);
            lst.add(sc.nextDouble());
        }
    }

    static double sumList(ArrayList<Double> lst) {
        double s = 0;
        for (Double x : lst) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) {
        ArrayList<Double> lstDouble = new ArrayList<>();
        inputList(lstDouble);
        System.out.print("Tong cac phan tu: " + sumList(lstDouble));
    }
}
