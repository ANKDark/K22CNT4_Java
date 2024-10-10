public class App {
    public static void main(String[] args) throws Exception {
        String hoTen = "Tran  Minh    Duc";
        hoTen = hoTen.replaceAll("\\s+", " ");
        System.out.println("Ho ten: " + hoTen);
        
    }
}
