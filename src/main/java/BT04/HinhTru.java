/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT04;

/**
 *
 * @author DELL
 */
public class HinhTru extends HinhTron {
    private double ChieuCao;
    
    public HinhTru() {
        super();
        ChieuCao=2;
    }
    public HinhTru(double BanKinh, double ChieuCao){
        super(BanKinh);
        this.ChieuCao = ChieuCao;
    }
    public double getChieuCao(){
        return ChieuCao;
    }
    public void setChieuCao(double ChieuCao){
        this.ChieuCao = ChieuCao;
    }
    @Override
    public double tinhDienTich(){
        return super.tinhDienTich()*2+super.tinhChuVi()*ChieuCao;
    }
    public double tinhTheTich(){
        return super.tinhDienTich()*ChieuCao;
    }
}
