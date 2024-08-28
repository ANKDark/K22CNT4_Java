public class TinhtongLe {
    public static void main(String[] args) {
        int S = 0;
        for (int i = 1; i <= 101; i++) {
            if (i % 2 == 1) {
                continue;
            }
            S += i;
        }
        System.out.println("S = " + S);
    }
}
