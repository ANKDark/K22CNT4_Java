package Bai01;

public class TreEm extends QlyThongTinMuaVe {
    private int chieuCao;

    public void setchieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getchieuCao() {
        return chieuCao;
    }

    public void xuatDL() {
        super.xuatDL();
        System.out.printf("%-10d", chieuCao);
    }

    public void nhapDL() {
        super.nhapDL();
        System.out.print("Nhap chieu cao: ");
        chieuCao = sc.nextInt();
        if (chieuCao > 100) {
            super.setgiaVe(130000);
            sc.nextLine();
        } else {
            super.setgiaVe(0);
            sc.nextLine();
        }
    }
}
