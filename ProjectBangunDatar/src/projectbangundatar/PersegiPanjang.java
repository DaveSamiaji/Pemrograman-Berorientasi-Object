/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

import java.util.Scanner;

/**
 *
 * @author Davee
 */
public class PersegiPanjang {
    // atribut
    
    int panjang;
    int lebar;
    
    // methods
    
    void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("Luas: " + luas + " satuan luas");
    }
    
    void hitungKeliling(){
        int keliling = 2 * (this.lebar + this.panjang);
        System.out.println("Keliling: " + keliling + " satuan panjang");
    }
    
    void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang : ");
        this.panjang = input.nextInt();
        
        System.out.print("Masukkan lebar : ");
        this.lebar = input.nextInt();
        
        this.hitungLuas();
        this.hitungKeliling();
    }
        
}
