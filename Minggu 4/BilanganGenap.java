/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangan.genap;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BilanganGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("System akan menampilkan bilangan genap dengan batasan akhir sesuai input user.\nSilahkan masukkan batas angka yang diinginkan :");
         int limit = scan.nextInt();

        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0)
                System.out.print(i + "  ");
    }
    } 
}
