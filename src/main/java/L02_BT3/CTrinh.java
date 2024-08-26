/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L02_BT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CTrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
     public static void menu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<SV> dssv = new ArrayList<>();
        String tiepTuc;
        do {
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien hoc luc Gioi");
            System.out.println("4. Sap xem danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.print("Nhap chuc nang ban muon: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1: 
                    nhapDanhSachSV(dssv);
                break;
                case 2: 
                    xuatDanhSachSV(dssv);
                break;
                case 3: 
                    xuatSinhVienGioi(dssv);
                break;
                case 4: 
                    xapSep();
                break;
                case 5: 
                break;
                default: System.out.print("Khong co chuc nang nay. Moi Nhap lai");
            }
            System.out.print("\nBan co muon tiep tuc khong (Y/N): ");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("Y"));
    }

    public static void nhapDanhSachSV(ArrayList<SV> dssv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        String ten = sc.nextLine();
        System.out.print("Nhap nganh sinh vien(IT / Biz): ");
        String nganh = sc.nextLine();
        if (nganh.equalsIgnoreCase("IT")) {
            System.out.print("Diem Java: ");
            double diemJava = sc.nextDouble();
            System.out.print("Diem Css: ");
            double diemCss = sc.nextDouble();
            System.out.print("Diem Html: ");
            double diemHtml = sc.nextDouble();
            sc.nextLine();

            SV svIT = new SVIT(diemJava, diemCss, diemHtml, ten, nganh);
            dssv.add(svIT);

        } else if (nganh.equalsIgnoreCase("Biz")) {
            System.out.print("Diem Marketing: ");
            double diemMarketing = sc.nextDouble();
            System.out.print("Diem Sales: ");
            double diemSales = sc.nextDouble();
            sc.nextLine();

            SV svBiz = new SVBiz(diemMarketing, diemSales, ten, nganh);
            dssv.add(svBiz);
        }
    }

    public static void xuatDanhSachSV(ArrayList<SV> dssv) {
        for (SV sv : dssv) {
            sv.xuat();
            System.out.println("--------------------");
        }
    }

    public static void xuatSinhVienGioi(ArrayList<SV> dssv) {
        for (SV sv : dssv) {
            if (sv.getHL().equalsIgnoreCase("gioi")) {
                sv.xuat();
                System.out.println("--------------------");
            }
        }
    }
    public static void sapXep(ArrayList<SV> dssv) {
        Comparator<SV> cmp = new Comparator<SV>() {
            @Override
            public int compare(SV sv1, SV sv2) {
                return Double.valueOf(sv1.getDiem()).compareTo(Double.valueOf(sv2.getDiem()));
            }
        };
        Collections.sort(dssv,cmp);
    }

    private static void xapSep() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
