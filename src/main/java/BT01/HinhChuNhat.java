/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT01;

/**
 *
 * @author DELL
 */
public class HinhChuNhat {
    private double length;
    private double width;
    
    public HinhChuNhat()
    {
        length = 8;
        width = 8;
    }
    public HinhChuNhat(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    //public void setLength()

    public HinhChuNhat(double length) {
        this.length = length;
    }
    public double ChuVi(){
        return (length+width)*2;
    }
    public double DienTich(){
        return length*width;
    }
    @Override
    public String toString() {
        return "HinhChuNhat"  + "Chieu dai=" + length + ", Chieu rong = " + width + ",Chu vi: " + ChuVi() + ", Dien tich: " + DienTich();
    }
}
