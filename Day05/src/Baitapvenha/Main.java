package Baitapvenha;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> dsSanPhams = new ArrayList<>();

        int num; // Khai báo biến num ngoài vòng lặp
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. In danh sach san pham");
            System.out.println("3. Tim san pham trong khoang gia");
            System.out.println("4. Sap xep san pham theo thanh tien");
            System.out.println("5. Thoat");
            System.out.println("6. In ra tong tien theo hang san xuat");
            System.out.print("Lua chon cong viec: ");

            num = sc.nextInt(); // Lấy lựa chọn của người dùng

            switch (num) {
                case 1:
                    // Nhập List n sản phẩm
                    System.out.print("Nhap so luong san pham: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        SanPham sp = new SanPham();
                        System.out.println("Nhap san pham thu: " + (i + 1));
                        sp.nhapDuLieu();
                        dsSanPhams.add(sp);
                    }
                    break;

                case 2:
                    // In danh sách n sản phẩm
                    if (dsSanPhams.isEmpty()) {
                        System.out.println("Danh sach san pham trong!");
                    } else {
                        System.out.println("Danh sach san pham:");
                        for (SanPham sp : dsSanPhams) {
                            sp.xuatDuLieu();
                        }
                    }
                    break;

                case 3:
                    // Tìm ra các sản phẩm có thành tiền nằm trong khoảng
                    if (dsSanPhams.isEmpty()) {
                        System.out.println("Danh sach san pham trong!");
                    } else {
                        System.out.print("Nhap gia bat dau: ");
                        double giaBatDau = sc.nextDouble();

                        System.out.print("Nhap gia ket thuc: ");
                        double giaKetThuc = sc.nextDouble();

                        System.out.println("San pham trong khoang gia:");
                        boolean found = false;
                        for (SanPham sp : dsSanPhams) {
                            double thanhTien = sp.tinhTien();
                            if (thanhTien >= giaBatDau && thanhTien <= giaKetThuc) {
                                sp.xuatDuLieu();
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Khong co san pham nao trong khoang gia nay.");
                        }
                    }
                    break;

                case 4:
                    // Sắp xếp danh sách theo chiều tăng dần của thành tiền
                    if (dsSanPhams.isEmpty()) {
                        System.out.println("Danh sach san pham trong!");
                    } else {
                        for (int i = 0; i < dsSanPhams.size() - 1; i++) {
                            for (int j = i + 1; j < dsSanPhams.size(); j++) {
                                if (dsSanPhams.get(i).tinhTien() > dsSanPhams.get(j).tinhTien()) {
                                    SanPham temp = dsSanPhams.get(i);
                                    dsSanPhams.set(i, dsSanPhams.get(j));
                                    dsSanPhams.set(j, temp);
                                }
                            }
                        }

                        System.out.println("Danh sach san pham sau khi sap xep theo thanh tien:");
                        for (SanPham sp : dsSanPhams) {
                            sp.xuatDuLieu();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                case 6:
                    if (dsSanPhams.isEmpty()) {
                        System.out.println("Danh sach san pham trong!");
                    } else {
                        HashMap<String, Double> tongTienTheoHangSX = new HashMap<>();

                        for (SanPham sp : dsSanPhams) {
                            String hangSX = sp.getHangSX();
                            double thanhTien = sp.tinhTien();

                            if (tongTienTheoHangSX.containsKey(hangSX)) {
                                tongTienTheoHangSX.put(hangSX, tongTienTheoHangSX.get(hangSX) + thanhTien);
                            } else {
                                tongTienTheoHangSX.put(hangSX, thanhTien);
                            }
                        }

                        System.out.println("Tong tien theo hang san xuat:");
                        for (Map.Entry<String, Double> entry : tongTienTheoHangSX.entrySet()) {
                            System.out.printf("Hang san xuat: %s, Tong tien: %.2f%n", entry.getKey(), entry.getValue());
                        }
                    }
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }

        } while (num != 5);

        sc.close();
    }
}
