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
public class triplePhytagoras {
    int a;
    int b;
    int c;
    
    void input(){
        System.out.println("Cek triple pythagoras");
        
        Scanner data = new Scanner(System.in);
        //sisi a
        System.out.println("Masukan sisi [a] : ");
        a = data.nextInt();
           
        //sisi b    
        System.out.println("Masukan sisi [b] : ");
        b = data.nextInt();
        
        //sisi c
        System.out.println("Masukan sisi [c] : ");
        c = data.nextInt();
     }   
        
    void cek(){
        int f = a * a;
        int e = b * b;
        int d = c * c;
        int g = e + f;
        
        if (d==g){
            System.out.println("Nilai " + a + ", " + b + ", " + c + " yaitu Triple Pythagoras");
        } else{
            System.out.println("Nilai " + a + ", " + b + ", " + c + " yaitu bukan Triple Pythagoras");
        }
    }
}
