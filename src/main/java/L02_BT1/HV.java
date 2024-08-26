/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02_BT1;

/**
 *
 * @author DELL
 */
public class HV extends HCN{
    public HV(double canh){
        super(canh, canh);
    }
    @Override
    public void xuat(){
        System.out.println("Hinh vuong co canh: " + rong + ", chu vi: "+ getChuVi());
    }
}
