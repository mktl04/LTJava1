/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT04;

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
        HinhTron htron = new HinhTron(5);
        System.out.println(htron);
        HinhTru htru = new HinhTru(5,6);
        System.out.println("HinhTru" + "BanKinh=" + htru.getBanKinh()+",ChieuCao="+htru.getChieuCao()+",DienTich="+htru.tinhDienTich()+",TheTich="+htru.tinhTheTich());
    }
}
