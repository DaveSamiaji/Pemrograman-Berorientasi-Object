/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Windows 10
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi a = new Operasi();
        System.out.println("Hasil Operasi Penjumlahan");
        System.out.println("a. Hasil penjumlahan dari 3 + 4 adalah " + a.jumlahkan(3, 4));
        System.out.println("b. Hasil penjumlahan dari 4 + 7 + (-9) adalah " + a.jumlahkan(4, 7, (-9)));
        System.out.println("c. Hasil penjumlahan dari 3.4 + (-0.002) + 0.12313  adalah " + a.jumlahkan(3.4, (-0.002), 0.12313));
        
        System.out.println("Hasil Operasi Perkalian");
        System.out.println("a. Hasil perkalian dari 3 * 4 adalah " + a.perkalian(3, 4));
        System.out.println("b. Hasil perkalian dari 4 * 7 * (-9) adalah " + a.perkalian(4, 7, (-9)));
        System.out.println("c. Hasil perkalian dari 3.4 * (-0.002) * 0.12313 adalah " + a.perkalian(3.4, (-0.002), 0.12313));
    }
    
}
