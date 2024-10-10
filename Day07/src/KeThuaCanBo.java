import java.util.Scanner;

public class KeThuaCanBo {
    private String maNV;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private String email;

    static Scanner sc = new Scanner(System.in);

    public KeThuaCanBo() {
    }

    public KeThuaCanBo(String maNV, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.maNV = maNV;
        this.tuoi = tuoi;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getmaNV() {
        return maNV;
    }

    public void setmaNV(String maNV) {
        String pattern = "[A-Z]{2}[0-9]{3}";
        if (maNV.matches(pattern)) {
            this.maNV = maNV;
        } else {
            throw new IllegalArgumentException("Ma phai 5 ki tu: 2 chu cai in hoa, 3 ki tu so");
        }
    }

    public String gethoTen() {
        return hoTen;
    }

    // public void sethoTen(String hoTen) {
    // String pattern = "^[A-Za-z ]{2,}$";
    // if (hoTen.matches(pattern)) {
    // this.hoTen = hoTen;
    // } else {
    // throw new IllegalArgumentException("Ho ten chi duoc chua chu cai va khoang
    // trang");
    // }
    // }
    public void sethoTen(String hoTen) {
        // Regular expression pattern to allow only alphabet characters and spaces
        String pattern = "^[a-zA-Z\\s]+$";

        if (hoTen.matches(pattern)) {
            // Split the string into words, capitalize the first letter of each word, and
            // rejoin them
            String[] words = hoTen.trim().toLowerCase().split("\\s+");
            StringBuilder capitalizedHoTen = new StringBuilder();

            for (String word : words) {
                capitalizedHoTen.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }

            // Set the result, trimming extra spaces at the end
            this.hoTen = capitalizedHoTen.toString().trim();
        } else {
            throw new IllegalArgumentException("Invalid name format. Only letters and spaces are allowed.");
        }
    }

    public int gettuoi() {
        return tuoi;
    }

    public void settuoi(int tuoi) {
        if (tuoi > 0) {
            this.tuoi = tuoi;
        } else {
            throw new IllegalArgumentException("Tuoi phai lon hon 0");
        }
    }

    public String getgioiTinh() {
        return gioiTinh;
    }

    public void setgioiTinh(String gioiTinh) {
        if (gioiTinh.equals("Nam") || gioiTinh.equals("Nu")) {
            this.gioiTinh = gioiTinh;
        } else {
            throw new IllegalArgumentException("Gioi tinh phai la 'Nam' hoac 'Nu'");
        }
    }

    public String getdiaChi() {
        return diaChi;
    }

    public void setdiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        String pattern = "^[A-Za-z0-9._%+-]+@gmail\\.com$";
        if (email.matches(pattern)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email khong hop le");
        }
    }

    public void xuatDuLieu() {
        System.out.printf("%-12s %-15s %-5s %-8s %-10s %-20s\n", maNV, hoTen, tuoi, gioiTinh, diaChi, email);
    }

    public void nhapDuLieu() {
        System.out.print("Nhap ma nhan vien: ");
        setmaNV(sc.nextLine());
        System.out.print("Nhap ho ten: ");
        sethoTen(sc.nextLine());
        System.out.print("Nhap tuoi: ");
        settuoi(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        setgioiTinh(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        setdiaChi(sc.nextLine());
        System.out.print("Nhap email: ");
        setemail(sc.nextLine());
    }
}
