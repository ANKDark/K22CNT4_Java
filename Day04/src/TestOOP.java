
import OtherPack.OtherPack;

public class TestOOP {
    public static void main(String[] args) {
        // Cách 1
        OopBT1 t = new OopBT1();
        // Cách 2
        OopBT1 t1;
        t1 = new OopBT1();

        // Other Pack
        OtherPack otp = new OtherPack();

        System.out.println(t.b);
        System.out.println(t.c);
        // Other pack
        System.out.println(otp.b);
    }
}
