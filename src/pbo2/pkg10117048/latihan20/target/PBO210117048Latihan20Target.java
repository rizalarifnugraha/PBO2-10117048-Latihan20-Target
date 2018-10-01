/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan20.target;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha
 * Kelas : PBO2 
 * NIM : 10117048
 * Deskripsi Program : Program yang berisi menghitung lama tabungan mencapai
 *                     saldo yang ditargetkan.
 */
public class PBO210117048Latihan20Target {

    /**
     * saldoTab = saldo tabungan
     * bungaBul = bunga bulanan
     * saldoBul = saldo bulanan
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        int saldoTab = 3500000;
        double bungaBul = 0.08;
        double saldoBul;

        while (saldoTab <= 6000000) {

            saldoBul = bungaBul * saldoTab;
            saldoTab = (int) (saldoTab + saldoBul);
            System.out.println("Saldo di bulan ke-" + i + " Rp. "
                    + saldoTab);
            i++;
        }
    }

}
