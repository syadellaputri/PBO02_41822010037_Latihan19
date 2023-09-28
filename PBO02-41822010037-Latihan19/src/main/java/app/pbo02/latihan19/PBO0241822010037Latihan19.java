/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pbo02.latihan19;

/**
 *
 * @author DelDel
 * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PBO0241822010037Latihan19 {

    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
       
        int saldo=2500000;
        double bunga=0.15;
        for(int n=1;n<=6;n++){
            double saldo_akhir = saldo*Math.pow(bunga+1,n);
            System.out.println("Saldo di bulan ke-" + n +"Rp."+saldo_akhir );
        }
    }
}
