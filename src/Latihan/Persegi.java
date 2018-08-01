/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.io.*;

/**
 *
 * @author Tarishaulia
 */
public class Persegi {
  public static void main(String[]args){
      BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
      String x = " ";
      int hitungluas = 0;
      System.out.println("---Luas Persegi");
      System.out.print("Masukkan nilai sisi : ");
      
    try {
            x = data.readLine();
            int angka = Integer.parseInt(x);
          int hitungLuas = angka * angka;
    }catch (IOException | NumberFormatException e) {
        System.out.println("Error");
    }
      int sisi = 0;
      int hitungLuas = sisi*sisi*sisi;
        System.out.println("Luas persegi dengan sisi " + x + " adalah " + hitungLuas);
        
      
      
   
     
      
   
      
  }
      
      
  }  

