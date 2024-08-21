import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Mời nhập a");
        a = sc.nextInt();
        System.out.println("Mời nhập b");
        b = sc.nextInt();
        c = a + b;
        System.out.println("Tổng = " + c);

    }
}
