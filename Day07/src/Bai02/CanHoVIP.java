package Bai02;

public class CanHoVIP extends QlyCH {
    private double heSoHuong;
    private String huong;
    private double price;

    public void setheSoHuong(double heSoHuong) {
        this.heSoHuong = heSoHuong;
    }

    public double getheSoHuong() {
        return heSoHuong;
    }

    public void sethuong(String huong) {
        this.huong = huong;
    }

    public String gethuong() {
        return huong;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public double getprice() {
        return price;
    }

    public void xuatDL() {
        super.xuatDL();
        System.out.printf("%-10s %-10.2f", huong, price);
    }

    public void nhapDL() {
        super.nhapDL();
        System.out.print("Huong can ho:\n  Huong Bien(1)\n  Huong TP(2)\n  Huong ho boi(3)\n  Huong khac(4)\n");
        int luaChon = sc.nextInt();

        switch (luaChon) {
            case 1:
                sethuong("Huong Bien");
                setheSoHuong(1.4);
                break;
            case 2:
                sethuong("Huong TP");
                setheSoHuong(1.2);
                break;
            case 3:
                sethuong("Huong ho boi");
                setheSoHuong(1.1);
                break;
            case 4:
                sethuong("Huong khac");
                setheSoHuong(1);
                break;
            default:
                System.out.println("Nhap sai!!");
        }
        price = super.getgiaSan() * super.getarea() * heSoHuong;
    }
}
