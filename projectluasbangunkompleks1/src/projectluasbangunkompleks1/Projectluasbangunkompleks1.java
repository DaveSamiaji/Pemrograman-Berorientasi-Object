/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks1;

/**
 *
 * @author Windows 10
 */
public class Projectluasbangunkompleks1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //Menghitung luas lingkaran
        double lingkaran1 = Lingkaran.hitungLuas(21);
        double lingkaran2 = Lingkaran.hitungLuas(14);
        double lingkaran3 = Lingkaran.hitungLuas(7);
        
        //Menghitung luas persegi
        double persegi = Persegi.hitungLuas(42);
        
        //Menghitung luas bangun yang diarsir
        double HasilTotalLuas1 = (lingkaran1 * 2) + persegi;
        double HasilTotalLuas2 = (lingkaran2 / 2) - lingkaran3;
        
        
       //Menampilkan output hasil luas bangun yang diarsir
        System.out.println("Hasil dari Luas Bangun Datar pada project1 yaitu : " + HasilTotalLuas1);
        System.out.println("Hasil dari Luas Bangun Datar pada project2 yaitu : " + HasilTotalLuas2);
    }
    }
    

