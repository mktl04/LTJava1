/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT01;

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
        // TODO code application logic here
        HinhChuNhat r1;
        HinhChuNhat r2;
        //Tao doi tuong r1:
        r1 = new HinhChuNhat();
        //Tao doi tuong r2:
        Scanner sc = new Scanner(System.in);
        System.out.println("Cho biet chieu dai: ");
        double chieuDai = sc.nextDouble();
        System.out.println("Cho biet chieu rong: ");
        double chieuRong = sc.nextDouble();
        r2 = new HinhChuNhat(chieuDai, chieuRong);
        //Xuat thong tin ket qua:
        System.out.println("Thong tin HCN thu nhat: ");
        System.out.println(r1);
        System.out.println("Thong tin HCN thu hai: ");
        System.out.println(r2);
    }
}
