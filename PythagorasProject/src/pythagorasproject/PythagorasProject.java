/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        System.out.println("Pilihan Menu Aplikasi Java Pythagoras Berikut :");
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.println("Silahkan Pilih Menu Pilihan Anda : ");
        
        Scanner pilihan = new Scanner(System.in);
        
        switch(pilihan.nextInt()){
            case 1 :
                triplePhytagoras t = new triplePhytagoras();
                t.input();
                t.cek();
                break;
            case 2 :
                sisiMiring c = new sisiMiring();
                c.input();
                c.sisiMiring();
                break;
            case 3 :
                siku2 siku = new siku2();
                siku.input();
                siku.sisi2();
                break;
            case 4:
                System.out.println("exit...");
                // Terminate JVM
                System.exit(0);
            default :
                System.out.println("Program Selesai");
                
        }
    }
    
}
