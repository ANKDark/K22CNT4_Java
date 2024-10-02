package Bai01;

public class NguoiLon extends QlyThongTinMuaVe {
    private int cCCD;

    public void setcCCD(int cCCD) {
        this.cCCD = cCCD;
    }

    public int getcCCD() {
        return cCCD;
    }

    public void xuatDL() {
        super.xuatDL();
        System.out.printf("%-10d", cCCD);
    }

    public void nhapDL() {
        super.nhapDL();
        System.out.print("Nhap CCCD: ");
        cCCD = sc.nextInt();
        super.setgiaVe(250000);
        sc.nextLine();
    }
}
