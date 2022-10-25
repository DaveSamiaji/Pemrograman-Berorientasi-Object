/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Windows 10
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menghitung Luas dan Keliling Persegi Panjang
        PersegiPanjang a = new PersegiPanjang();

        System.out.println("Hasil Luas dan Keliling Persegi Panjang");
        System.out.println("a. Persegi panjang dengan p = 6 dan l = 4 mempunyai keliling " + a.keliling(6, 4) + " dan luas " + a.luas(6, 4));
        System.out.println("b. Persegi panjang dengan p = 3.6 dan l = 8 mempunyai keliling " + a.keliling(3.6, 8) + " dan luas " + a.luas(3.6, 8));
        System.out.println("c. Persegi panjang dengan p = 6 dan l = 8.3 mempunyai keliling " + a.keliling(6, 8.3) + " dan luas " + a.luas(6, 8.3));
        System.out.println("d. Persegi panjang dengan p = 5.6 dan l = 8.8 mempunyai keliling " + a.keliling(5.6, 8.8) + " dan luas " + a.luas(5.6, 8.8));

        // Menghitung Luas Persegi
        Persegi b = new Persegi();

        System.out.println("Hasil Luas dan Keliling Persegi");
        System.out.println("a. Persegi dengan s = 4.5 mempunyai keliling " + b.keliling(4.5) + " dan luas " + b.luas(4.5));
        System.out.println("b. Persegi dengan s = 7 mempunyai keliling " + b.keliling(7) + " dan luas " + b.luas(7));
    
        // Menghitung Luas Lingkaran
        Lingkaran c = new Lingkaran();

        System.out.println("Hasil Luas dan Keliling Lingkaran");
        System.out.println("a. Lingkaran dengan r = 5 mempunyai keliling " + c.keliling(5) + " dan luas " + c.luas(5));
        System.out.println("b. Lingkaran dengan r = 7.4 mempunyai keliling " + c.keliling(7.4) + " dan luas " + c.luas(7.4));
        
        // Menghitung Luas dan Keliling Segitiga
        Segitiga d = new Segitiga();

        System.out.println("Hasil Luas Segitiga");
        System.out.println("a. Luas segitiga dengan a = 8 dan t = 10 adalah " + d.luas(8, 10));
        System.out.println("b. Luas segitiga dengan a = 8 dan t = 11.5 adalah " + d.luas(8, 11.5));
        System.out.println("c. Luas segitiga dengan a = 12.2 dan t = 9 adalah " + d.luas(12.2, 9));
        System.out.println("d. Luas segitiga dengan a = 13.9 dan t = 20.7 adalah " + d.luas(13.9, 20.7));
        }
}
