/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02_BT3;

/**
 *
 * @author DELL
 */
abstract public class SV {
       public String hoTenSV;
       public String nganh;
       public SV(String hoTenSV, String nganh){
           this.hoTenSV = hoTenSV;
           this.nganh = nganh;
       }
       abstract public double getDiem();
       public String getHL() {
        String kq = "";
        double dtb = getDiem();
        if (dtb < 5) {
            kq = "Yeu";
        } else if (dtb < 6.5) {
            kq = "Trung Binh";
        } else if (dtb < 7.5) {
            kq = "Kha";
        } else if (dtb < 9) {
            kq = "Gioi";
        } else {
            kq = "Xuat sac";
        }
        return kq;
    }
       public void xuat() {
        System.out.println("Ho ten: " + hoTenSV);
        System.out.println("Nganh: " + nganh);
        System.out.println("Diem: " + getDiem());
        System.out.println("Hoc luc: " + getHL());
    }
}
