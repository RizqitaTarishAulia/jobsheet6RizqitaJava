/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Tarishaulia
 */
public class ContohLainKalkulatorSderhana {
    static float total = 0, bil1 = 1, bil2 = 1;//global
    
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        while(bil1 !=0 & bil2 !=0){
            System.out.println("Kalkulator Sederhana");
            System.out.println("1.PENJUMLAHAN");
            System.out.println("2.PENGURANGAN");
            System.out.println("3.PERKALIAN");
            System.out.println("4.PEMBAGIAN");
            System.out.print("Masukkan Pilihan anda = ");
            int pilihan = input.nextInt();
            
            System.out.print("Masukkan Bilangan Ke-1 = ");
            bil1 = input.nextFloat();
            System.out.print("Masukkan Bilangan Ke-2 = ");
            bil2 = input.nextFloat();
            
            switch(pilihan){
                
                case 1 :
                    System.out.println(+bil1 + "+" + bil2);
                    System.out.print("Hasilnya = ");
                    total = bil1 + bil2;
                break;    
                    
                case 2 :
                    System.out.println(+bil1 + "-" + bil2);
                    System.out.print("Hasilnya = ");
                    total = bil1 - bil2;  
                break;    
                    
                case 3 :
                    System.out.println(+bil1 + "*" + bil2);
                    System.out.print("Hasilnya = ");
                    total = bil1 * bil2;
                break;    
                    
                case 4 :
                    System.out.println(+bil1 + "/" + bil2);
                    System.out.print("Hasilnya = ");
                    total = bil1 / bil2; 
                break;
                default :
                    
                    System.out.println("Anda harus mengisi angka");
                    
            }
             System.out.println(total);
        }
    }
}
