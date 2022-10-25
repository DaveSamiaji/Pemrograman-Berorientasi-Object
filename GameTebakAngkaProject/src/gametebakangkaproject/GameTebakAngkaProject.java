/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tebakAngka;
        
        bilanganRandom rn = new bilanganRandom();
        int random = rn.generate();
        
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        Scanner masukan = new Scanner(System.in);
        
//        while(true){
//            System.out.println("Masukan Tebakan Anda : ");
//            tebakAngka = masukan.nextInt();
//            
//            if(tebakAngka < random){
//                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
//                
//            } else if(tebakAngka > random){
//                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
//                
//            } else if(tebakAngka == random) {
//                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
//                break;
//            } else{
//                System.out.println("Masukan angka !!!");
//            }
//        }
        
        do{
            System.out.println("Masukan Tebakan Anda : ");
            tebakAngka = masukan.nextInt();
            
            if(tebakAngka < random){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
                
            } else if(tebakAngka > random){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                break;
            }
        } while (tebakAngka != random);
    }
    
}
