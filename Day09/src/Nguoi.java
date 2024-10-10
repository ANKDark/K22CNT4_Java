public class Nguoi {
    private String ma;
    private String hoTen;
    private int tuoi;

    public void setma(String ma) {
        String pattern = "[A-Z]{2}[0-9]{3}";
        if (ma.matches(pattern)) {
            this.ma = ma;
        } else {
            throw new IllegalArgumentException("Ma phai 5 ki tu: 2 chu cai in hoa, 3 ki tu so");
        }
    }

    public String getma() {
        return ma;
    }

    public void sethoTen(String hoTen) {

    }

    public String gethoTen() {
        return hoTen;
    }

    public void settuoi(int tuoi) {
        if (tuoi <= 0) {
            throw new IllegalArgumentException("Tuoi phai lon hon 0");
        } else {
            this.tuoi = tuoi;
        }
    }
}
