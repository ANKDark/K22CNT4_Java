import java.util.ArrayList;
import java.util.Scanner;

public class arListBT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> questions = new ArrayList<>();

        System.out.println("Nhập vào 4 câu hỏi:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Câu hỏi " + (i + 1) + ": ");
            questions.add(scanner.nextLine());
        }

        System.out.println("\nTất cả các phương án trộn của 4 câu hỏi là:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == i)
                    continue;
                for (int k = 0; k < 4; k++) {
                    if (k == i || k == j)
                        continue;
                    for (int l = 0; l < 4; l++) {
                        if (l == i || l == j || l == k)
                            continue;
                        System.out.println(
                                questions.get(i) + ", " + questions.get(j) + ", " + questions.get(k) + ", "
                                        + questions.get(l));
                    }
                }
            }
        }
    }
}
