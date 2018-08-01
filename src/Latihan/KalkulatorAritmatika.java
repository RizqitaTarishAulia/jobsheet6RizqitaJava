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
public class KalkulatorAritmatika {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String ulangi ="y";
  
    int pem1,pem2,pembagian;
    int pil;
    
    System.out.println("---KALKULATOR---");
    System.out.println("MASUKKAN PILIHAN ") ;
    System.out.println("PILIHAN 1 : PENJUMLAHAN");
    System.out.println("PILIHAN 2 : PENGURANGAN");
    System.out.println("PILIHAN 3 : PERKALIAN");
    System.out.println("PILIHAN 4 : PEMBAGIAN");
    System.out.print("PILIHAN : ");
    pil=input.nextInt();
    switch(pil){
        
    
    
    case 1  :{
          
    
    System.out.print("MASUKAN ANGKA =");
    int bil2 = input.nextInt();
    System.out.print("MASUKKAN ANGKA =");
    int bil1 = input.nextInt();
    int hasil = bil1+bil2;
    System.out.println("HASILNYA = " +hasil);
    break;
    
    }
    
    case 2 :{
    System.out.print("MASUKKAN ANGKA =");
    int bil1 = input.nextInt();
    System.out.print("MASUKKAN ANGKA =");
    int bil2 = input.nextInt();
    int hasil = bil1-bil2;
    System.out.println("HASILNYA = " +hasil);
    break;
    
    }
    
    case 3 :{
    System.out.print("MASUKKAN ANGKA =");
    int bil1 = input.nextInt();
    System.out.print("MASUKKAN ANGKA =");
    int bil2 = input.nextInt();
    int hasil = bil1*bil2;
    System.out.println("HASILNYA = " +hasil);
    break;
    
    }
    
    case 4 :;
    System.out.print("MASUKKAN ANGKA =");
    int bil1 = input.nextInt();
    System.out.print("MASUKKAN ANGKA =");
    int bil2 = input.nextInt();
    int hasil = bil1/bil2;
    System.out.println("HASILNYA = " +hasil);
    break;
    
    
    
    }
    }
}

