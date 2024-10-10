import java.util.regex.Pattern;

public class BienSo {
    public static void main(String[] args) {
        String bienSo;

        String chck = "5\\d[A-Z]\\d-\\d{5}";
        Pattern pattern = Pattern.compile(chck);

        bienSo = "52A1-23456";

        if (pattern.matcher(bienSo).matches()) {
            System.out.println(bienSo + " hop le.");
        } else {
            System.out.println(bienSo + " khong hop le.");
        }
    }
}
