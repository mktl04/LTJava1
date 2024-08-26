/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02_BT1;

/**
 *
 * @author DELL
 */
public class HCN {
    public double dai;
    public double rong;
    
    public HCN(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }
    public double getChuVi(){
        return(dai + rong)*2;
    }
    public double getDienTich(){
        return dai * rong;
    }
    public void xuat(){
        System.out.println("Hinh Chu Nhat co chieu dai: " + dai + ", chieu rong: " + rong + ", chu vi: " + getChuVi() + ", dien tich: " + getDienTich());
    }
}
