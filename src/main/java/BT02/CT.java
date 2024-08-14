/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT02;

import java.text.DecimalFormat;

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
        Account tk1, tk2;
        //DecimalFormat fmt = new DecimalFormat("#,##0");
        //
        tk1 = new Account("TK001", "Nguyen Van A", 250000000);
        //
        tk2 = new Account("TK002", "Le Van Tam", 999999999);
        System.out.println("---------THONG TIN TAI KHOAN NGAN HANG BAN DAU---------");
        System.out.println("My account: id:" + tk1.getID() + " - Name: " + tk1.getName() + " - " + tk1.getBalance());
        System.out.println("Other account: id:" + tk2.getID() + " - Name: " + tk2.getName() + " - " + tk2.getBalance());

        tk1.credit(500000);
        tk2.credit(700000);
        System.out.println("---------THONG TIN SAU KHI RUT/NAP TIEN--------");
        System.out.println("My account: id:" + tk1.getID() + " - Name: " + tk1.getName() + " - " + tk1.getBalance());
        System.out.println("Other account: id:" + tk2.getID() + " - Name: " + tk2.getName() + " - " + tk2.getBalance());
        
        tk2.transferTo(tk1, 67111);
        System.out.println("---------THONG TIN SAU KHI DA CHUYEN TIEN--------");
        System.out.println("My account: id:" + tk1.getID() + " - Name: " + tk1.getName() + " - " + tk1.getBalance());
        System.out.println("Other account: id:" + tk2.getID() + " - Name: " + tk2.getName() + " - " + tk2.getBalance());

    }

    //private static String fmt(int balance) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

}
