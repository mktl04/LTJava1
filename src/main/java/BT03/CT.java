/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        String tiepTuc;
        ArrayList<SP> sanPham = new ArrayList<>();
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. In danh sach");
            System.out.println("3. Sap xep giam dan theo gia");
            System.out.println("4. Tim va xoa san pham theo ten");
            System.out.println("5. Xuat gia trung binh");
            System.out.print("Nhap chuc nang ban muon: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 0 -> {
                    System.out.println("Chao tam biet. Hen gap lai!!!");
                    return;
                }
                case 1 -> nhapDanhSachSP(sanPham);
                case 2 -> inDanhDach(sanPham);
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                    double giaTB = tinhTrungBinh(sanPham);
                    System.out.print(giaTB);
                }
                default -> System.out.print("Khong co chuc nang nay. Moi Nhap lai");
            }
            System.out.println("\nBan co muon tiep tuc khong (Y/N)");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("Y"));
    }

    public static void nhapDanhSachSP(ArrayList<SP> sanPham) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        String ten = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        int gia = sc.nextInt();
        SP sp = new SP(ten, gia);
        sanPham.add(sp);
    }

    public static void inDanhDach(ArrayList<SP> sanPham) {
        for (SP sanPham1 : sanPham) {
            System.out.print(sanPham1 + "\n");
        }
    }

    public static double tinhTrungBinh(ArrayList<SP> sanPham) {
        if (sanPham.isEmpty()) {
            return 0;
        }
        int tongGia = 0;
        for (SP sanPham1 : sanPham) {
            tongGia += sanPham1.getGiaSP();
        }
        return (double) tongGia / sanPham.size();
    }
}
    
