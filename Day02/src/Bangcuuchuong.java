import java.util.Scanner;

public class Bangcuuchuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bang cuu chuong:");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("Bang cuu chuong " + i + " * " + j + " = " + (i * j) + "\t");
            }
        }
    }
}
