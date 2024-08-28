import java.util.Arrays;
import java.util.Scanner;

public class Baitulam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz;
        System.out.println("Nhap do dai cua mang: ");
        sz = sc.nextInt();
        int[] a = new int[sz];

        for (int i = 0; i < sz; i++) {
            System.out.println("Nhap gia tri " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // Cách 1
        int positiveCount = 0;
        int[] positiveValues = new int[5];
        for (int i = 0; i < sz; i++) {
            if (a[i] > 0) {
                positiveValues[positiveCount++] = a[i];
            }
        }

        positiveValues = Arrays.copyOf(positiveValues, positiveCount);

        Arrays.sort(positiveValues);

        positiveCount = 0;
        for (int i = 0; i < sz; i++) {
            if (a[i] > 0) {
                a[i] = positiveValues[positiveCount++];
            }
        }

        System.out.println("Gia tri trong mang la:");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        // Cách 2
        for (int i = 0; i < sz - 1; i++) {
            if (a[i] > 0) {
                for (int j = i + 1; j < sz; j++) {
                    if (a[j] < a[i] && a[j] >= 0) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        System.out.println("Gia tri trong mang la:");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }

}
