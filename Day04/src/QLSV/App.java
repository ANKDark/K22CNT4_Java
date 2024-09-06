package QLSV;

public class App {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.sethoTen("Tran Minh Duc");
        System.out.println("Ho ten" + sv.gethoTen());
        sv.setdiem(10);
        System.out.println("Diem: " + sv.getdiem());
    }
}
