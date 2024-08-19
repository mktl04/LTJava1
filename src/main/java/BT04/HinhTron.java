/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT04;

/**
 *
 * @author DELL
 */
public class HinhTron {
    private double BanKinh;
    
    public HinhTron(){
        BanKinh = 1.0;
    }
    public HinhTron(double BanKinh){
        this.BanKinh = BanKinh;
    }
    public double getBanKinh(){
        return BanKinh;
    }
    public void setBanKinh(double BanKinh){
        this.BanKinh = BanKinh;
    }
    public double tinhDienTich(){
        return Math.PI*BanKinh*BanKinh;
    }
    public double tinhChuVi(){
        return Math.PI*2*BanKinh;
    }
    @Override
    public String toString(){
        return "HinhTron{" + "BanKinh=" + BanKinh + '}';
    }
}
