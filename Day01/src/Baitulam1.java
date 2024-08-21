import java.util.Arrays;
import java.util.Scanner;

public class Baitulam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap gia tri " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int[] positiveValues = new int[5];
        for (int i = 0; i < 5; i++) {
            if (a[i] > 0) {
                positiveValues[positiveCount++] = a[i];
            }
        }

        positiveValues = Arrays.copyOf(positiveValues, positiveCount);

        Arrays.sort(positiveValues);

        positiveCount = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] > 0) {
                a[i] = positiveValues[positiveCount++];
            }
        }

        System.out.println("Gia tri trong mang la:");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
