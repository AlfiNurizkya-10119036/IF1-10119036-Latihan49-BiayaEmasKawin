/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan49.biayaemaskawin;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program  Menghitung Biaya Membeli Emas
 */
public class BiayaEmasKawin {

    private static double harga = 570000;
    private double totalBerat;

    public void setTotalBerat(double totalBerat) {
        this.totalBerat = totalBerat;
    }

    public double getTotalBerat() {
        return totalBerat;
    }

    public double hitungTotal(double totalBerat){
        return harga * totalBerat;
    }

    public void tampilHasil(double totalHarga){
        System.out.println("harga emas : "+harga);
        System.out.println("total harga : "+totalHarga);
    }
}
