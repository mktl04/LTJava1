/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT03;

/**
 *
 * @author DELL
 */
public class SP {
    private String TenSP;
    private double GiaSP;
    
    public SP(String TenSP, double GiaSP){
        this.TenSP = TenSP;
        this.GiaSP = GiaSP;
    }
    public String getTenSanPham(){
        return TenSP;
    }
    public double getGiaSP(){
        return GiaSP;
    }
}

