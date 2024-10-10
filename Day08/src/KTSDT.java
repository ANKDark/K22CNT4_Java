public class KTSDT {
    public static void main(String[] args) {
        String phone = "0123456789";
        String pattern = "0[0-9]{9,10}";
        if (phone.matches(pattern)) {
            System.out.println("Nhap dung");
        } else {
            System.out.println("Nhap sai");
        }
    }
}
