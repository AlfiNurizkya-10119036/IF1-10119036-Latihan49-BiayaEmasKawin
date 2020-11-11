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

import java.util.Scanner;
public class Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BiayaEmasKawin emas = new BiayaEmasKawin();
        System.out.println("Program Perhitungan harga Emas");
        System.out.print("Masukkan berat (gram) : ");
        emas.setTotalBerat(scan.nextDouble());
        emas.tampilHasil(emas.hitungTotal(emas.getTotalBerat()));
    }
}
