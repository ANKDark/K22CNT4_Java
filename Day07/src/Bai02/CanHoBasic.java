package Bai02;

public class CanHoBasic extends QlyCH {
    private double price;

    public void setprice(double price) {
        this.price = price;
    }

    public double getprice() {
        return price;
    }

    public void xuatDL() {
        super.xuatDL();
        System.out.printf("%-10d", price);
    }

    public void nhapDL() {
        super.nhapDL();
        price = super.getgiaSan() * super.getarea();
    }
}
