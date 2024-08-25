/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02_BT2;

/**
 *
 * @author DELL
 */
public class SVBiz extends SV {

    public double diemMarketing;
    public double diemSales;

    public SVBiz(double diemMarketing, double diemSales, String hoTenSV, String nganh){
        super(hoTenSV, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
