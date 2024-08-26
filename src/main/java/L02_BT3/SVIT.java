/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02_BT3;

/**
 *
 * @author DELL
 */
public class SVIT extends SV{
    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SVIT(double diemJava, double diemCss, double diemHtml, String hoTenSV, String nganh) {
        super(hoTenSV, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemCss + diemHtml) / 4;
    }
}
