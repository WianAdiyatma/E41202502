/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        double jumlah = 0;
        double Rata = 0;
        int max = 0, min = 1000;
        int nilai;
        
        System.out.println("Masukkan banyak data nilai:");
        nilai = in.nextInt();
        
        while (i <= nilai) {
            int total = i + 1;
            int[]nilai_total = new int [total];
            
            System.out.print("Masukkan data ke " + i + ":");
            nilai_total[i] = in.nextInt();
            jumlah = nilai_total[i] + jumlah;
            if (nilai_total[i] > max) {
                max = nilai_total[i];
                
            }
                    if ((nilai_total[i] < min)&&(nilai_total[i] >= 1)){
                        min = nilai_total[i];
                    }
                    i++;
                    }
                Rata = jumlah / (i - 1);
                System.out.println("Total: " + (int)Math.round(jumlah)); 
                System.out.println("Rata-rata :" + Rata); 
                System.out.println("Angka terkecil :" + min); 
                System.out.println("Angka terbesar :" + max);
                
                
                
                }
            }
            
        
    
    


